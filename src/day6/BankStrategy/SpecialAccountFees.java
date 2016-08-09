package day6.BankStrategy;

public class SpecialAccountFees implements ApplyFeesStrategy {
    @Override
    public long fees(long balance, double threshold) {
        return 0;
    }
}
