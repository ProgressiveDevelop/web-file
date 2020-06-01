package com.file.base;

import com.file.entity.VirtualFile;
import com.file.interfaces.ApiClient;

/**
 * @author 桂在坚持
 * @version 1.0
 * @date 2020/5/30
 * @since 1.0
 */
public interface FileFunction {
    ApiClient getApiClient(String uploadType);

    VirtualFile saveFile(VirtualFile virtualFile, boolean save, String uploadType);

    boolean removeFile(ApiClient apiClient, String filePath, String uploadType);
}
