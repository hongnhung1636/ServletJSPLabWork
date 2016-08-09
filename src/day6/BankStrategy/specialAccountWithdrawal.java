package day6.BankStrategy;

public class specialAccountWithdrawal implements GrantWithdrawalStrategy {
    @Override
    public long withdrawlAmount(long balance, long amount) {
        return 0;
    }

    @Override
    public boolean WithdrawalAllow(long balance, long amount, int times) {
        System.out.println("No withdrawals allowed for Special account");
        return false;
    }
}
