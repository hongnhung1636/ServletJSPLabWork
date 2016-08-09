package day6.BankStrategy;

interface GrantWithdrawalStrategy {
    long withdrawlAmount(long balance, long amount);
    boolean WithdrawalAllow(long balance, long amount, int times);
}

