package by.training.arraytask.exception;

public class CustomArrayException extends Exception {

    public CustomArrayException() {}

    public CustomArrayException(String message) {
        super(message);
    }

    public CustomArrayException(String message, Throwable cause) {
        super(message, cause);
    }
}
