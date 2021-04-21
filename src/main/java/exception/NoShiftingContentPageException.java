package exception;

public class NoShiftingContentPageException extends UserFriendlyException {
    public NoShiftingContentPageException(){
        super("No Shifting Content Page found");
    }
}
