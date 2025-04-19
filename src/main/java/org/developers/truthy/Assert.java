package org.developers.truthy;

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
}
