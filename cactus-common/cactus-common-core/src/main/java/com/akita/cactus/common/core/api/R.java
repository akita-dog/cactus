package com.akita.cactus.common.core.api;

import org.springframework.http.HttpStatus;

public class R<T> {
    private int code;

    private String message;

    private T data;

    R(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    R(HttpStatus status, T data) {
        new R(status.value(), status.getReasonPhrase(), data);
    }

    public static <T> R<T> ok(T data) {
        return new R(HttpStatus.OK, data);
    }

    public static <T> R<T> failed(T data) {
        return new R(HttpStatus.INTERNAL_SERVER_ERROR, data);
    }

    public static <T> R<T> forbidden(T data) {
        return new R(HttpStatus.FORBIDDEN, data);
    }
}
