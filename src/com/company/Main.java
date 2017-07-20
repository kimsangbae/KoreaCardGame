package com.company;

public class Main {

    public static void main(String[] args) {

        KoreaCardGame game = new KoreaCardGame();

        if(!game.standByPlayer()) {
            return;
        }

        game.queryDepositToPlayer();
        game.divideCardsToPlayer();
        game.playBetting();
        game.findWinner();
        game.sendMoneyToWinner();

        return;
    }
}
