public interface BankAccountDecorator {
    String showAccountType();
    double getInterestRate();
    double computeBalanceWithInterest();
    String showBenefits();
    String showInfo();
}
