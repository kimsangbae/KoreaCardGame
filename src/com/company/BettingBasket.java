package scalar;

public class BettingBasket {

    private int money;

    public BettingBasket() {
        money = 0;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void initBasket() {
        money = 0;
    }
}