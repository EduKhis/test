public class DebitCardPoint extends DebitCard {
    private double point;

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public DebitCardPoint(double balance) {
        super(balance);
    }


    @Override
    public boolean takeMoney(double coin) {
        if (getBalance() >= coin) {
            setBalance(getBalance() - coin);
            setPoint(coin*0.01);
            return true;
        }
        System.out.println("Put your balance");
        return false;
    }

    @Override
    public void showBalance() {
        System.out.println("Balance card: " + getBalance());
        System.out.println("Your points: "+ point);
    }
}
