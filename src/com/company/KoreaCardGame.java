package scalar;


import java.util.Scanner;

public class KoreaCardGame implements GameMaker {

	private KoreaCardPlayer koreaCardPlayer[];
	private BettingBasket bettingBasket;
	private KoreaCardDeck koreaCardDeck;

	private int playerCount;
	private int winnerPlayerIndex;

	public KoreaCardGame() {
		bettingBasket = new BettingBasket();
		koreaCardDeck = new KoreaCardDeck();
		playerCount = 0;
	}

	public int getPlayerCount() {
		return playerCount;
	}

	@Override
	public int standByPlayer() {

		playerCount++;
		return playerCount;
	}

	@Override
	public void queryDepositToPlayer() {
		for(int i = 0; i < playerCount; i++) {
			koreaCardPlayer[i].SendDepositMoney(bettingBasket, START_DEPOSIT_MONEY);
		}
	}

	@Override
	public void divideCardsToPlayer() {
		for(int i = 0; i < playerCount; i++) {
			for(int j = 0; j < PLAY_CARD_COUNT; j ++) {
				koreaCardPlayer[i].SetCards(koreaCardDeck.getCard());
			}
		}
	}

	@Override
	public void playBetting() {
		int money = 0;

		for(int i = 0; i < playerCount; i++) {

			Scanner sc = new Scanner(System.in);
			int selection = sc.nextInt();

			switch (selection) {
				case BETTING_GOING_ON://플레이어가 베팅할 금액을 money에 입력 받는다.
					koreaCardPlayer[i].BetMoney(bettingBasket, money);

				case DIE://플레이어가 이길 자신 없어서 베팅을 관두고 게임을 나간다.
					koreaCardPlayer[i].dieOutGame();
			}
		}
	}

	@Override
	public void findWinner() {
		winnerPlayerIndex = 0;
	}

	@Override
	public void sendMoneyToWinner() {
		koreaCardPlayer[winnerPlayerIndex].gainMoney(bettingBasket);
		bettingBasket.initBasket();
	}
}