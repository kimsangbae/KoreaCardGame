package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class KoreaCardGame implements GameMaker {

	private KoreaCardPlayer[] players;
	private BasketMoney basketMoney;
	private KoreaCardDeck koreaCardDeck;

	private int playerCount;
	private int winnerPlayerIndex;

	public KoreaCardGame() {
		basketMoney = new BasketMoney();
		koreaCardDeck = new KoreaCardDeck(TOTAL_CARD_COUNT);
		playerCount = 0;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	@Override
	public boolean standByPlayer() {
		int money = 0;

		System.out.println("선수는 몇 명 입니까?");
		Scanner sc = new Scanner(System.in);
		playerCount = sc.nextInt();

		if(playerCount > 10)
			return false;

		for(int i = 0; i < playerCount; i++) {
			System.out.println(i + "번째 선수는 얼마를 가지고 있습니까?");
			sc = new Scanner(System.in);
			money = sc.nextInt();
			players[i] = new KoreaCardPlayer(money, PLAY_CARD_COUNT);
		}

		if(playerCount >= 2)
			return true;
		else
			return false;
	}

	@Override
	public void queryDepositToPlayer() {
		for(int i = 0; i < playerCount; i++) {
			players[i].sendDepositMoney(basketMoney, START_DEPOSIT_MONEY);
		}
	}

	@Override
	public void divideCardsToPlayer() {
		for(int i = 0; i < playerCount; i++) {
			for(int j = 0; j < PLAY_CARD_COUNT; j ++) {
				players[i].setCards(koreaCardDeck.getCard());
			}
		}
	}

	@Override
	public void playBetting() {
		int money = 0;

		while(playerCount != 1) {
			for (int i = 0; i < playerCount; i++) {

				System.out.println("베팅을 하시겠습니까? <Y / N>");
				Scanner sc = new Scanner(System.in);
				String selection = sc.toString();

				switch (selection) {
					case BETTING_GOING_ON: //플레이어가 이길 자신이 있어서 베팅을 한다.
						players[i].betMoney(basketMoney, money);
						break;

					case DIE://플레이어가 이길 자신 없어서 베팅을 관두고 게임을 나간다.
						players[i].dieOutGame();
						break;

					default:
						break;
				}
			}
		}
	}

	@Override
	public void findWinner() {

		winnerPlayerIndex = 0;
	}

	@Override
	public void sendMoneyToWinner() {
		players[winnerPlayerIndex].gainMoney(basketMoney);
		basketMoney.initBasket();
	}
}