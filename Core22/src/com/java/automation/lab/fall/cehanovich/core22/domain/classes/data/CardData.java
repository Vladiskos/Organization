package com.java.automation.lab.fall.cehanovich.core22.domain.classes.data;

import com.java.automation.lab.fall.cehanovich.core22.domain.classes.Card;
import com.java.automation.lab.fall.cehanovich.core22.domain.enums.AccessLevel;

import java.util.Arrays;

public class CardData extends Data {
    private Card[] cards;

    public CardData(String information, AccessLevel accessLevel, Card[] cards) {
        super(information, accessLevel);
        this.cards = cards;
    }

    public Card[] getCards() {
        return cards;
    }

    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    @Override
    public String toString() {
        return "Data cars {\nInformation: " + information + "\nAccess level: " + accessLevel + "\nCards: " +
                cards.toString() + "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        CardData other = (CardData) that;
        return information.equals(other.information) && accessLevel == other.accessLevel &&
                Arrays.equals(cards,other.cards);
    }

    @Override
    public int hashCode() {
        return (accessLevel.hashCode() + information.hashCode()) / 2 + cards.hashCode();
    }
}
