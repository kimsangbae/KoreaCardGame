package com.company;

import java.util.ArrayList;

public class KoreaCardDeck implements DeckControllable {

    List<KoreaCard> cards;


    public KoreaCardDeck(int totalCardCount) {
        cards = new ArrayList<>(totalCardCount);
        initCards(totalCardCount);
    }

    @Override
    public void initCards(int totalCardCount) {
        for(int i = 0; i < totalCardCount/2; i++) {
            for(int j = 0; j < 2; j++) {
                cards.add(new KoreaCard(FIRST_KOREA_CARD, String.valueOf(i)));
                cards.add(new KoreaCard(SECOND_KOREA_CARD, String.valueOf(i)));
            }
        }
    }

    @Override
    public int shuffleCards() {
        double randomeValue = Math.random();
        int intValue = (int)(randomeValue*20) + 1;
        return intValue;
    }

    @Override
    public void setCard() {

    }

    @Override
    public KoreaCard getCard() {
        int intValue = shuffleCards();
        return cards.get(intValue);
    }
}
