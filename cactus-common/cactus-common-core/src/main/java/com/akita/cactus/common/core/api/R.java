package com.akita.cactus.common.core.api;

import org.springframework.http.HttpStatus;

public class R<T> {
    private long code;

    private String message;

    private T data;

    R(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    R(HttpStatus status, T data) {
        this.code = status.value();
        this.message = status.getReasonPhrase();
    }

    public static <T> R ok(T data) {
        return new R(HttpStatus.OK, data);
    }
}
