package com.file.exception;

/**
 * @author 桂在坚持
 * @version 1.0
 * @date 2017/7/12 10:29
 * @since 1.0
 */
public class OssApiException extends GlobalFileException {

    public OssApiException(String message) {
        super(message);
    }

    public OssApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
