package Card;

public class CreditCard {
    int accountNumber;
    int accountValue;

    public CreditCard(int accountNumber, int accountValue){
        this.accountNumber = accountNumber;
        this.accountValue = accountValue;
    }
    public void topUpBalance(){
        accountValue += 100;
    }
    public void withdrawBalance(){
        accountValue -= 100;
    }

    public void accountInfo(){
        System.out.println("Current account number: " + accountNumber);
        System.out.println("Current account value: " + accountValue);
    }
}
