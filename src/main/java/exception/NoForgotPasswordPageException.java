package exception;

public class NoForgotPasswordPageException extends UserFriendlyException {
    public NoForgotPasswordPageException(){
        super("No Forgot Password Page found");
    }
}
