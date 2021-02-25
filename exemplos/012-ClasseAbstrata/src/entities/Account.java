package entities;

public abstract class Account {
    private Integer number;
    private String holder;
    protected Double balance; //protected permite a visibilidade a outras classes do mesmo pacote e as subclasses (classes filhas extends) em outros pacotes

    public Account() { }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(Double amount){
        this.balance -= amount + 5.0;
    }

    public void deposit(Double amount){
        this.balance += amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "number=" + number +
                ", holder='" + holder + '\'' +
                ", balance=" + balance +
                '}';
    }

}
