package day4.Banking;

public class Banking {
    public static void main(String[] args) {
        Account[] accounts = new Account[3];
        accounts[0] = new MortgageAccount("David", 100000);
        accounts[1] = new CheckingAccount("Tom", 200);
        accounts[2] = new CheckingAccount("Danny", 1000);

        for (int i = 0; i < accounts.length; i++){
            System.out.println();
            System.out.println("'Try to Deposit 1000'");
            accounts[i].deposit(1000);
            System.out.println("Balance: " + accounts[i].getBalance());
            System.out.println("'Try to withdraw 500'");
            accounts[i].withdraw(500);
            System.out.println("Balance: " + accounts[i].getBalance());
            System.out.println("'Try to withdraw 1000'");
            accounts[i].withdraw(1000);
            System.out.println("Balance: " + accounts[i].getBalance());
            System.out.println("'Try to withdraw 2000'");
            accounts[i].withdraw(2000);
            System.out.println("Current Balance: " + accounts[i].getBalance());
        }
    }
}
