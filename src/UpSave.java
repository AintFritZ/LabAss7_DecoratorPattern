public class UpSave extends AbstractDecorator {

    public UpSave(BankAccountDecorator account) {
        super(account);
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 4.0;
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = account.computeBalanceWithInterest();
        return balance + (account.computeBalanceWithInterest() * (getInterestRate() - 1.0) / 100);
    }

    @Override
    public String showBenefits() {
        return super.showBenefits() + " + With Insurance";
    }
}
