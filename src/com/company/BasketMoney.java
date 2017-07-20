package com.company;

public class BasketMoney {

    private int money;

    public BasketMoney() {
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