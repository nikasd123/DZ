public class Authorisation extends Exception{

    String login;
    String password;
    String confirmPassword;

    public Authorisation(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }


}
