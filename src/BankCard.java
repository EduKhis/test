public abstract class BankCard {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public abstract void putMoney(double coin);

    public abstract boolean takeMoney(double coin);

    public abstract void showBalance();

    public BankCard(double balance) {
        this.balance = balance;
    }

    public BankCard() {
    }
}
