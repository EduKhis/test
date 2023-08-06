public class DebitCard extends BankCard{


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
        System.out.println("Balance card: " + getBalance());
    }

    public DebitCard(double balance) {
        super(balance);
    }

    public DebitCard() {
    }
}
