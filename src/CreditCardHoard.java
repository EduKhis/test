public class CreditCardHoard extends CreditCard{
    public CreditCardHoard(double balance, double creditLimit) {
        super(balance, creditLimit);
    }

    @Override
    public void putMoney(double coin) {
        setBalance(getBalance()+coin*1.005);
    }
}
