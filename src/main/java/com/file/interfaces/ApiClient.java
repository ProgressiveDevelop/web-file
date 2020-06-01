package com.file.interfaces;

import com.file.entity.VirtualFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;

/**
 * @author 桂在坚持
 * @version 1.0
 * @date 2019/2/11 14:37
 * @since 1.0
 */
public interface ApiClient {

    VirtualFile uploadImg(MultipartFile file);

    VirtualFile uploadImg(File file);

    VirtualFile uploadImg(InputStream is, String key);

    boolean removeFile(String key);
}
