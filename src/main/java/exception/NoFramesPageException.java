package exception;

public class NoFramesPageException extends UserFriendlyException {
    public NoFramesPageException() {
        super("No Frames Page found");
    }
}
