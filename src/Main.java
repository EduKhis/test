public class Main {
    public static void main(String[] args) {
        DebitCard debitCard = new DebitCard();
        debitCard.putMoney(10000);
        debitCard.takeMoney(1000);
        debitCard.showBalance();

        CreditCard creditCard = new CreditCard(10000, 5000);
        creditCard.takeMoney(7000);
        creditCard.putMoney(500);
        creditCard.showBalance();

        //Потенциальный кэшбэк 5% от покупок при условии трат больше 5 000 тыс.
        DebitCardCashback debitCardCashback = new DebitCardCashback(20000);
        debitCardCashback.takeMoney(10000);
        debitCardCashback.takeMoney(4000);
        debitCardCashback.showBalance();

        //Бонусные баллы в размере 1% от покупок.
        DebitCardPoint debitCardPoint = new DebitCardPoint(10000);
        debitCardPoint.takeMoney(5000);
        debitCardPoint.showBalance();

        //Накопление в размере 0.005% от суммы пополнений.
        CreditCardHoard creditCardHoard = new CreditCardHoard(10000, 5000);
        creditCardHoard.putMoney(1000);
        creditCardHoard.showBalance();
    }
}
















