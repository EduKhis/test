public class DebitCardCashback extends DebitCard {

    public DebitCardCashback(double balance) {
        super(balance);
    }
    public DebitCardCashback() {
    }

    @Override
    public boolean takeMoney(double coin) {
        if (getBalance() >= coin) {
            if (coin>=5000){
                setBalance(getBalance()-coin+coin*0.05);
            }
            else {
                setBalance(getBalance()-coin);
            }
            return true;
        }
        System.out.println("Put your balance");
        return false;
    }
}
