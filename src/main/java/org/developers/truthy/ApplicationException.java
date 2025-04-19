package org.developers.truthy;

import org.springframework.http.HttpStatus;

/**
 * <p>
 * This exception is meant to be use with {@link org.springframework.context.MessageSource}
 * </p>
 * <p>
 * The {@code message} field should be code of error that is used by MessageSource
 * <br>
 * The {@code args} field is intended for message templating
 * <br>
 * The {@code status} field is intended for returning response status
 * </p>
 */
public class ApplicationException extends RuntimeException {
    private Object[] args;
    private HttpStatus status = HttpStatus.BAD_REQUEST;

    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(String message, Object... args) {
        super(message);
        this.args = args;
    }

    public ApplicationException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }

    public ApplicationException(String message, HttpStatus status, Object... args) {
        super(message);
        this.status = status;
        this.args = args;
    }

    public Object[] getArgs() {
        return args;
    }

    public HttpStatus getStatus() {
        return status;
    }
}
