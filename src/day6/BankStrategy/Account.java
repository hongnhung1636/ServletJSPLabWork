package day6.BankStrategy;

public class Account  {

    private long balance;
    private long amount;
    private int times;
    private GrantWithdrawalStrategy grantWithdrawalStrategy;
    private ApplyFeesStrategy applyFeesStrategy;

    public Account(GrantWithdrawalStrategy g, ApplyFeesStrategy a){
        grantWithdrawalStrategy = g;
        applyFeesStrategy = a;
    }

    public long applyGrantWithdrawalStrategy(long bal, long amt){
        if (grantWithdrawalStrategy.WithdrawalAllow(bal,amt, times)){
            System.out.println("Amount User Wants to Withdrawn: "+amount);
            times++;
            return grantWithdrawalStrategy.withdrawlAmount(bal, amt);
        }else return 0;
    }

    public long applyApplyFeesStrategy(long bal, double threshold){
        System.out.println("Applied fee");
        return applyFeesStrategy.fees(bal, threshold);
    }

    public void depositAmount(long a)
    {
        balance=balance+a;
        System.out.println("Money deposited");
    }

    private void transaction(String m)
    {
        System.out.println(m);
    }
}

