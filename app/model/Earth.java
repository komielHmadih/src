package app.model;

import java.util.ArrayList;
import java.util.List;

public class Earth {
    private int id;
    private Place2[] handPlace = new Place2[6];
    private Place2[] monsterPlace = new Place2[5];
    private Place2[] magicPlace = new Place2[5];
    private Place1 hiddenCardPlace;
    private Place1 mergeCardPlace;
    private Place1 graveYardCardPlace;

    //constructor
    public Earth(int id) {
        this.id = id;
    }

    //get and set
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    //methods
    public void addCard() {
    }

    public void attack() {
    }

    public void defence() {
    }

    public Place[] getHandPlace() {
        return handPlace;
    }

    public void setHandPlace(Place2[] handPlace) {
        this.handPlace = handPlace;
    }

    public Place2[] getMonsterPlace() {
        return monsterPlace;
    }

    public void setMonsterPlace(Place2[] monsterPlace) {
        this.monsterPlace = monsterPlace;
    }

    public Place2[] getMagicPlace() {
        return magicPlace;
    }

    public void setMagicPlace(Place2[] magicPlace) {
        this.magicPlace = magicPlace;
    }

    public Place1 getHiddenCardPlace() {
        return hiddenCardPlace;
    }

    public void setHiddenCardPlace(Place1 hiddenCardPlace) {
        this.hiddenCardPlace = hiddenCardPlace;
    }

    public Place1 getMergeCardPlace() {
        return mergeCardPlace;
    }

    public void setMergeCardPlace(Place1 mergeCardPlace) {
        this.mergeCardPlace = mergeCardPlace;
    }

    public Place1 getGraveYardCardPlace() {
        return graveYardCardPlace;
    }

    public void setGraveYardCardPlace(Place1 graveYardCardPlace) {
        this.graveYardCardPlace = graveYardCardPlace;
    }
}
