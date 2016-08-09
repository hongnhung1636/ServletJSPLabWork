package day6.BankStrategy;

public class Main {
    public static void main(String[] args) {
        //Withdrawing $100 from Normal Account
        Account normalAccount = new Account(new normalAccountWithdrawal(), new NormalAccountFees());
        System.out.println("Withdrawal Strategy for Normal Account");
        System.out.println(normalAccount.applyGrantWithdrawalStrategy(1000, 100));
        System.out.println("Fees Strategy for Normal Account");
        System.out.println(normalAccount.applyApplyFeesStrategy(1000, 25));
        //Withdrawing from Special Account
        Account MortgageAccount = new Account(new specialAccountWithdrawal(), new SpecialAccountFees());
        System.out.println("Withdrawal Strategy for Special Account");
        System.out.println(MortgageAccount.applyGrantWithdrawalStrategy(1000, 1000));
        System.out.println("Fees Strategy for Special Account");
        System.out.println(MortgageAccount.applyApplyFeesStrategy(1000, 2000));

    }
}
