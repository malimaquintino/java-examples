package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(Double amount){
        if (amount <=  this.loanLimit){
            this.balance += amount - 10.00;
        }
    }

    // final no metodo não permite que ele seja sobreescrito
    @Override
    public final void withdraw(Double amount){
        super.withdraw(amount);
        this.balance -= + 2.0;
    }

    @Override
    public String toString() {
        return "BusinessAccount{" +
                "number=" + getNumber() +
                ", holder='" + getHolder() + '\'' +
                ", balance=" + getBalance() +
                ", loanLimit=" + loanLimit +
                '}';
    }
}
