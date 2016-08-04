package day4.Banking;


public abstract class Account {

    private long _balance;
    private String _holderName;

    public Account() {
    }
    public Account(String holderName) {
        this._holderName = holderName;
    }

    public final void transaction(String message, long amount){
        System.out.println("Holder name: "+ _holderName);
        System.out.println("Transaction method: "+ message);
        System.out.println("Amount: "+ amount);
        long balance = this._balance + amount;
        this._balance = balance;
    }

    public long getBalance(){
        return this._balance;
    }

    public abstract boolean deposit(long amount);

    public abstract boolean withdraw(long amount);


}
