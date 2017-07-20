package com.company;

import java.util.ArrayList;
import java.util.List;

public class KoreaCardPlayer implements BetGamePlayable {

    private int money;
    private int cardCount;
    List<KoreaCard> hands;


    public KoreaCardPlayer(int money, int cardCount) {
        this.money = money;
        this.cardCount = cardCount;
        hands = new ArrayList<>(cardCount);
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public void sendDepositMoney(BasketMoney basketMoney, int startMoney) {
        basketMoney.setMoney(startMoney);
        loseMoney(startMoney);
    }

    @Override
    public void setCards(KoreaCard koreaCard) {
        hands.add(koreaCard);
    }

    @Override
    public void betMoney(BasketMoney basketMoney, int betMoney) {
        basketMoney.setMoney(betMoney);
        loseMoney(betMoney);
    }

    @Override
    public void loseMoney(int betmoney) {
        this.money -= betmoney;
    }

    @Override
    public void gainMoney(BasketMoney basketMoney) { this.money += basketMoney.getMoney(); }

    @Override
    public void dieOutGame() {

    }

    @Override
    public void returnCard() {

    }
}