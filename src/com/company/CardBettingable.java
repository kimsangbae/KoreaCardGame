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

public interface CardBettingable {

    abstract void SendDepositMoney(BettingBasket bettingBasket, int startMoney);
    abstract void SetCards(KoreaCard koreaCard);
    abstract void BetMoney(BettingBasket bettingBasket, int betMoney);
    abstract void loseMoney(int betmoney);
    abstract void gainMoney(BettingBasket bettingBasket);
    abstract void dieOutGame();
    abstract void returnCard();
}
