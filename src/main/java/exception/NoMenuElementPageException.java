package exception;

public class NoMenuElementPageException extends UserFriendlyException{
    public NoMenuElementPageException(){
        super("No Menu Element Page found");
    }
}
