package com.file.base;

import com.file.entity.VirtualFile;
import com.file.exception.GlobalFileException;
import com.file.interfaces.ApiClient;
import com.file.interfaces.FileUploader;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.InputStream;

/**
 * @author 桂在坚持
 * @version 1.0
 * @date 2019/2/11 13:47
 * @since 1.0
 */
public class GlobalFileUploader implements FileUploader {
    private final FileFunction function;

    public GlobalFileUploader(FileFunction function) {
        this.function = function;
    }

    @Override
    public VirtualFile upload(InputStream is, String uploadType, String imageUrl, boolean save) {
        ApiClient apiClient = function.getApiClient(uploadType);
        VirtualFile virtualFile = apiClient.uploadImg(is, imageUrl);
        return function.saveFile(virtualFile, save, uploadType);
    }

    @Override
    public VirtualFile upload(File file, String uploadType, boolean save) {
        ApiClient apiClient = function.getApiClient(uploadType);
        VirtualFile virtualFile = apiClient.uploadImg(file);
        return function.saveFile(virtualFile, save, uploadType);
    }

    @Override
    public VirtualFile upload(MultipartFile file, String uploadType, boolean save) {
        ApiClient apiClient = function.getApiClient(uploadType);
        VirtualFile virtualFile = apiClient.uploadImg(file);
        return function.saveFile(virtualFile, save, uploadType);
    }

    @Override
    public boolean delete(String filePath, String uploadType) {
        if (StringUtils.isEmpty(filePath)) {
            throw new GlobalFileException("[文件服务]文件删除失败，文件为空！");
        }
        ApiClient apiClient = function.getApiClient(uploadType);
        return function.removeFile(apiClient, filePath, uploadType);
    }
}
