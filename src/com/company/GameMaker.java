package com.company;

/**
 *  게임규칙
 *
 1. 플레이어를 모집한다. (v)
 2. 공탁금을 내도록 한다.
 3. 카드를 섞은 뒤 나눠 준다. (v)
 4. 플레이어가 베팅한다. (v)
 5. 1등을 가려낸다. (v)
 6. 1등에게 돈 준다. (v)
 */

public interface GameMaker {
    static final int START_DEPOSIT_MONEY = 100;
    static final int PLAY_CARD_COUNT = 2;
    static final int BETTING_GOING_ON = 1;
    static final int DIE = 2;


    abstract int standByPlayer();
    abstract void queryDepositToPlayer();
    abstract void divideCardsToPlayer();
    abstract void playBetting();
    abstract void findWinner();
    abstract void sendMoneyToWinner();
}