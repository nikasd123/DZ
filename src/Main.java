import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException, WrongConfirmException {
        loginAuthorisation();
        passwordAuthorisation();
    }

    public static void loginAuthorisation() throws WrongLoginException {
        Scanner input = new Scanner(System.in);
        int symbolCount = 0; // symbol counter from String

        System.out.println("Please enter your login: ");
        String login = input.nextLine();

        char[] loginLength = login.toCharArray(); // from string to char array
        for (char ch : loginLength) {
            symbolCount++;
        }

        if(login.contains(" ") || symbolCount > 20){
            throw new WrongLoginException();
        }

    }

    public static void passwordAuthorisation() throws WrongPasswordException, WrongConfirmException {
        Scanner input = new Scanner(System.in);
        int symbolCount = 0;
        boolean isContainNumber = true;

        System.out.println("Please enter your password: ");
        String password = input.nextLine();

        char[] passwordLength = password.toCharArray();
        for (char ch : passwordLength) {
            symbolCount++;
        }

        while (isContainNumber) { // checking for numbers in String
            if (password.matches(".*\\d.*")) {
                if (password.contains(" ") || symbolCount > 20) {
                    throw new WrongPasswordException();
                }

                System.out.println("Please confirm your password: ");
                String confirmPassword = input.nextLine();

                if (password.equals(confirmPassword)) {
                    System.out.println("You have successfully completed authorization");
                    break;
                } else
                    throw new WrongConfirmException();
            } else {
                System.err.println("Password should to have at least one number!");
                throw new WrongPasswordException();
            }
        }


    }
}
