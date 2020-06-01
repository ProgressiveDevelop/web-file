package com.file.alioss.entity;

import com.aliyun.oss.model.CannedAccessControlList;

/**
 * @author 桂在坚持
 * @version 1.0

 * @date 2017/7/12 10:29
 * @since 1.0
 */
public class BucketEntity extends AbstractEntity {

    /*
     * 私有读写	      CannedAccessControlList.Private <br>
     * 公共读私有写	  CannedAccessControlList.PublicRead <br>
     * 公共读写	      CannedAccessControlList.PublicReadWrite
     */
    private CannedAccessControlList acl;

    public CannedAccessControlList getAcl() {
        return acl;
    }

    public BucketEntity(String bucketName) {
        super(bucketName);
    }

    public BucketEntity setAcl(CannedAccessControlList acl) {
        this.acl = acl;
        return this;
    }
}
