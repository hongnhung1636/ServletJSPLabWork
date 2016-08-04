package day4.Banking;

public class MortgageAccount extends Account {

    private long _amount_borrowed;

    public MortgageAccount(String holderName, long amount) {
        super(holderName);
        this._amount_borrowed = amount;
        super.transaction("Initial Borrowed Amount" , amount);
    }

    @Override
    public boolean deposit(long amount) {
        super.transaction("Mortgage Payment", -1 * amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        System.out.println("You can't withdraw with Mortgage Account");
        return false;
    }
}
