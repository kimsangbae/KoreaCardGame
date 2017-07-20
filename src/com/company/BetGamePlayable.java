package com.company;

/**
 *  Bettingable
 *
 1. 공탁금을 낸다
 2. 카드를 받는다
 3. 베팅한다
 4. 돈을 잃거나
 5. 돈을 얻는다
 6. 죽는다.
 7. 카드를 돌려준다
 */

public interface BetGamePlayable {

    abstract void sendDepositMoney(BasketMoney basketMoney, int startMoney);
    abstract void setCards(KoreaCard koreaCard);
    abstract void betMoney(BasketMoney basketMoney, int betMoney);
    abstract void loseMoney(int betmoney);
    abstract void gainMoney(BasketMoney basketMoney);
    abstract void dieOutGame();
    abstract void returnCard();
}
