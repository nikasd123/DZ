public class WrongLoginException extends Throwable {
    public WrongLoginException() {
        super("Login can`t contain spaces and can`t be more than 20 symbols!");
    }
}
