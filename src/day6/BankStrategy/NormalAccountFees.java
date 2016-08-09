package day6.BankStrategy;

public class NormalAccountFees implements ApplyFeesStrategy {
    private final double limit = 25;
    @Override
    public long fees(long balance, double threshold) {
        if (balance < limit) return 5;
        else return 0;
    }
}
