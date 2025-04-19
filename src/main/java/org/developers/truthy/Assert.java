package org.developers.truthy;

import java.util.Collection;

public abstract class Assert {
    public static void assertThat(boolean expression, String code) {
        if (!expression) {
            throw new ApplicationException(code);
        }
    }

    public static void assertThat(boolean expression, String code, Object... args) {
        if (!expression) {
            throw new ApplicationException(code, args);
        }
    }

    public static void assertNotNull(Object object, String code) {
        if (object == null) {
            throw new ApplicationException(code);
        }
    }

    public static void assertNotNull(Object object, String code, Object... args) {
        if (object == null) {
            throw new ApplicationException(code, args);
        }
    }

    public static void assertNull(Object object, String code) {
        if (object != null) {
            throw new ApplicationException(code);
        }
    }

    public static void assertNull(Object object, String code, Object... args) {
        if (object != null) {
            throw new ApplicationException(code, args);
        }
    }

    public static void assertNotEmpty(Collection<?> collection, String code) {
        if (collection == null || collection.isEmpty()) {
            throw new ApplicationException(code);
        }
    }

    public static void assertNotEmpty(Collection<?> collection, String code, Object... args) {
        if (collection == null || collection.isEmpty()) {
            throw new ApplicationException(code, args);
        }
    }

    public static void assertNotEmpty(Object[] array, String code) {
        if (array == null || array.length == 0) {
            throw new ApplicationException(code);
        }
    }

    public static void assertNotEmpty(Object[] array, String code, Object... args) {
        if (array == null || array.length == 0) {
            throw new ApplicationException(code, args);
        }
    }
}
