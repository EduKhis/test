public class CreditCard extends BankCard{
    private final double creditLimit;

    public CreditCard(double balance, double creditLimit) {
        super(balance);
        this.creditLimit = creditLimit;
    }

    @Override
    public void putMoney(double coin) {
        setBalance(getBalance()+coin);
    }

    @Override
    public boolean takeMoney(double coin) {
        if (getBalance() >= coin) {
            setBalance(getBalance()-coin);
            return true;
        }
        System.out.println("Put your balance");
        return false;
    }

    @Override
    public void showBalance() {
        System.out.println("Credit limit: " + creditLimit);
        if (getBalance()>creditLimit) {
            System.out.println("Credit balance: " + creditLimit);
            System.out.println("Balance card: " + (getBalance()-creditLimit));
        }
        else {
            System.out.println("Credit balance: " + getBalance());
            System.out.println("Balance card: " + 0);
        }

    }
}
