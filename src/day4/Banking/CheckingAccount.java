package day4.Banking;

public class CheckingAccount extends Account {

    private long _overdraft_amount;
    public CheckingAccount(String holderName, long overdraft_amount) {
        super(holderName);
        this._overdraft_amount = overdraft_amount;
    }

    @Override
    public boolean deposit(long amount) {
        super.transaction("Checking Deposit",amount);
        return true;
    }

    @Override
    public boolean withdraw(long amount) {
        if((super.getBalance() - amount) > _overdraft_amount){
            super.transaction("Checking withdraw", -1 * amount);
            return true;
        }
        else {
            System.out.println("You dont have enough money to withdraw "+ amount);
            return false;
        }
    }


}
