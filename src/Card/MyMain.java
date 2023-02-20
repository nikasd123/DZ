package Card;

public class MyMain {
    public static void main (String[] args){
        CreditCard firstAccountNumber = new CreditCard(111, 230);
        CreditCard secondAccountNumber = new CreditCard(222, 15);
        CreditCard thirdAccountNumber = new CreditCard(333, 501);

        firstAccountNumber.accountInfo();
        secondAccountNumber.accountInfo();
        thirdAccountNumber.accountInfo();
        System.out.println();


        System.out.println("Top up balance on first and second account, and withdraw from third");
        firstAccountNumber.topUpBalance();
        secondAccountNumber.topUpBalance();
        thirdAccountNumber.withdrawBalance();

        firstAccountNumber.accountInfo();
        secondAccountNumber.accountInfo();
        thirdAccountNumber.accountInfo();
    }

}
