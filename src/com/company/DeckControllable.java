package com.company;

/**
 *  덱
 *
 1. 패를 섞는다
 2. 패를 돌린다
 3. 패를 회수한다
 */


public interface DeckControllable {

    static final String FIRST_KOREA_CARD = "main";
    static final String SECOND_KOREA_CARD = "sub";

    abstract void shuffle();
    abstract void setCard();
    abstract KoreaCard getCard();
}