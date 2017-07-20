package scalar;

import java.util.ArrayList;

public class KoreaCardDeck implements DeckControllable {

    ArrayList<KoreaCard> cards ;

    public KoreaCardDeck() {
        cards = new ArrayList<>(20);
    }


    @Override
    public void shuffle() {
        //카드를 섞는다.
    }

    @Override
    public void setCard() {
        //카드를 회수한다.
        //카드개수 +1
    }

    @Override
    public KoreaCard getCard() {
        //카드를 플레이어에게 준다.
        //카드개수 -1
        return cards;
    }
}
