public class WrongPasswordException extends Throwable{
    public WrongPasswordException() {
        super("Password can`t be more than 20 symbols and " +
                "can`t contain spaces");
    }
}
