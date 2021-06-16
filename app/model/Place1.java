package app.model;

import java.util.ArrayList;
import java.util.List;

public class Place1 extends Place {

    private List<Card> cardList = new ArrayList<>();// list of card in place

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

}
