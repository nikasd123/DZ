import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongConfirmException, WrongPasswordException {
        Authorisation authorisation = new Authorisation();
        authorisation.loginAuthorisation();
        authorisation.passwordAuthorisation();
    }

}
