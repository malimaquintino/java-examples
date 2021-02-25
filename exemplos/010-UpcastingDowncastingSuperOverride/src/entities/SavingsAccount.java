package entities;

// uma classe final evita que ela seja herdada, final no metodo não permite que ele seja sobreescrito
public final class SavingsAccount extends Account {
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        this.balance += this.balance * this.interestRate;
    }

    // sobreposisção do metodo - o @Override informa o compilador de uma sobrescrita do metodo, mais visivel para idenficação
    // final no metodo não permite que ele seja sobreescrito
    @Override
    public final void withdraw(Double amount){
        this.balance -= amount;
    }
}
