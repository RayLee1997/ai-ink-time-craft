package net.ray1997.time.craft.client.dto;

import lombok.Builder;
import lombok.Getter;

import java.io.Serializable;

@Getter
@Builder
public class Result<T> implements Serializable {
    public static final Integer CODE_OK = 200;
    public static final Integer CODE_404 = 404;
    public static final Integer CODE_500 = 500;

    private Integer code;

    private String message;

    private T body;

    public static <T> Result<T> of(T body) {
        return (Result) Result.builder()
                              .code(CODE_OK)
                              .body(body)
                              .build();
    }

    public static <T> Result<T> error(int code, String msg) {
        return (Result<T>) Result.builder()
                                 .code(code)
                                 .message(msg)
                                 .build();
    }

}
