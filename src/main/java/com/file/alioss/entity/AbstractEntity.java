package com.file.alioss.entity;


/**
 * @author 桂在坚持
 * @version 1.0
 * @date 2017/7/12 10:29
 * @since 1.0
 */
public abstract class AbstractEntity {
    private String bucketName;

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public AbstractEntity() {
    }

    public AbstractEntity(String bucketName) {
        this.bucketName = bucketName;
    }
}
