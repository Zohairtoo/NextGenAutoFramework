package xohairtoo.exception;

public class AutomationException extends RuntimeException{
    public AutomationException(String message) {
        super(message);
    }

    public AutomationException(String message, Throwable cause) {
        super(message, cause);
    }

    public AutomationException(Throwable cause) {
        super(cause);
    }
}
