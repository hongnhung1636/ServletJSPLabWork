package day6.BankStrategy;

class normalAccountWithdrawal implements GrantWithdrawalStrategy {
    @Override
    public long withdrawlAmount(long balance, long amount) {
        return balance - amount;
    }

    @Override
    public boolean WithdrawalAllow(long balance, long amount, int times) {
        if (balance - amount < 0 || times > 5) {
            return false;
        }
        else{
            return true;
        }
    }
}
