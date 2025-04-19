package org.developers.truthy;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public abstract class Check {
    public static boolean isNull(Object object) {
        return object == null;
    }

    public static boolean isNotNull(Object object) {
        return !isNull(object);
    }

    public static boolean isNull(MultipartFile file) {
        return file == null || file.isEmpty();
    }

    public static boolean isNotNull(MultipartFile file) {
        return !isNull(file);
    }

    public static boolean isEmpty(List<Object> list) {
        return list == null || list.isEmpty();
    }

    public static boolean isNotEmpty(List<Object> list) {
        return !isEmpty(list);
    }
}
