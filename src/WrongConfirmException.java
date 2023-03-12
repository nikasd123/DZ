public class WrongConfirmException extends Throwable{
    public WrongConfirmException(){
        super("You have wrote another password.");
    }
}
