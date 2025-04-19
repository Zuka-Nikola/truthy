package org.developers.truthy;

import org.springframework.web.multipart.MultipartFile;

import java.util.Collection;

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

    public static boolean isEmpty(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean isNotEmpty(Collection<?> collection) {
        return !isEmpty(collection);
    }

    public static boolean isEmpty(Object[] array) {
        return array == null || array.length == 0;
    }

    public static boolean isNotEmpty(Object[] array) {
        return !isEmpty(array);
    }
}
