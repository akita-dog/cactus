package com.akita.cactus.common.core.api;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class R<T> {
    private int code;

    private String message;

    private T data;

    R(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public R(HttpStatus status, T data) {
        this.code = status.value();
        this.message = status.getReasonPhrase();
        this.data = data;
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

    public static <T> R<T> unauthorized(T data) {
        return new R(HttpStatus.UNAUTHORIZED, data);
    }
}
