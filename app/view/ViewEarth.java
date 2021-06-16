package app.view;

import app.model.Earth;
import app.model.Place;

public class ViewEarth {
    public int getCardNumber(Earth earth) {
        return earth.getHiddenCardPlace().getCardList().size();
    }

    // OO / DH / DO /E ...
    public String statusOfPlace() {
        return "";
    }

}
