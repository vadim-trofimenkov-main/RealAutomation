package exception;

public class UserFriendlyException extends RuntimeException {
    public UserFriendlyException() {
    }

    public UserFriendlyException(String message) {
        super(message);
    }
}