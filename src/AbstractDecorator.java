public abstract class AbstractDecorator implements BankAccountDecorator {
    protected BankAccountDecorator account;

    public AbstractDecorator(BankAccountDecorator account) {
        this.account = account;
    }

    @Override
    public String showAccountType() {
        return account.showAccountType();
    }

    @Override
    public double getInterestRate() {
        return account.getInterestRate();
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.computeBalanceWithInterest();
    }

    @Override
    public String showBenefits() {
        return account.showBenefits();
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }
}
