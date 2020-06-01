package com.file.exception;

/**
 * @author 桂在坚持
 * @version 1.0

 * @date 2018/4/16 16:26
 * @since 1.0
 */
public class GlobalFileException extends RuntimeException {
    public GlobalFileException() {
        super();
    }

    public GlobalFileException(String message) {
        super(message);
    }

    public GlobalFileException(String message, Throwable cause) {
        super(message, cause);
    }

    public GlobalFileException(Throwable cause) {
        super(cause);
    }

    protected GlobalFileException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
