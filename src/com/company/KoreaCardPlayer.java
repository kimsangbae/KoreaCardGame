package scalar;

public class KoreaCardPlayer implements CardBettingable {

    private int money;

    private KoreaCard koreaCard[];  //카드 필드 선언
    private int cardCount;

    public KoreaCardPlayer(int money, int cardCount) {
        this.cardCount = cardCount;
        koreaCard = new KoreaCard[cardCount];
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void SendDepositMoney(BettingBasket bettingBasket, int startMoney) {
        bettingBasket.setMoney(startMoney);
        loseMoney(startMoney);
    }

    @Override
    public void SetCards(KoreaCard koreaCard) {
        //cardCount만큼 카드를 소유한다.
    }

    @Override
    public void BetMoney(BettingBasket bettingBasket, int betMoney) {
        bettingBasket.setMoney(betMoney);
        loseMoney(betMoney);
    }

    @Override
    public void loseMoney(int betmoney) {
        this.money -= betmoney;
    }

    @Override
    public void gainMoney(BettingBasket bettingBasket) {
        this.money += bettingBasket.getMoney();
    }

    @Override
    public void dieOutGame() {

    }

    @Override
    public void returnCard() {

    }
}