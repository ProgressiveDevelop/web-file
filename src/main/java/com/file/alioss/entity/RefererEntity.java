package com.file.alioss.entity;

import java.util.List;

/**
 * @author 桂在坚持
 * @version 1.0
 * @date 2017/7/12 10:29
 * @since 1.0
 */
public class RefererEntity extends AbstractEntity {

    List<String> refererList;

    public List<String> getRefererList() {
        return refererList;
    }

    public RefererEntity(String bucketName) {
        super(bucketName);
    }

    public void setRefererList(List<String> refererList) {
        this.refererList = refererList;
    }
}
