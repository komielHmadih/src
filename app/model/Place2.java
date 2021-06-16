package app.model;

public class Place2 extends Place {

    private Card card;
    private Place parentPlace;

    public Place2(Card card) {
        this.card = card;
    }

    public Place getParentPlace() {
        return parentPlace;
    }



    public void setParentPlace(Place parentPlace) {
        this.parentPlace = parentPlace;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
