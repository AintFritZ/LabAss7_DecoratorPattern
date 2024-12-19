public class GSave extends AbstractDecorator {

    public GSave(BankAccountDecorator account) {
        super(account);
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 2.5;
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = account.computeBalanceWithInterest();
        return balance + (account.computeBalanceWithInterest() * (getInterestRate() - 1.0) / 100);
    }

    @Override
    public String showBenefits() {
        return super.showBenefits() + " + GCash Transfer";
    }
}
