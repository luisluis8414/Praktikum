package io.fp.collections;

import java.util.ArrayList;

public class CardSet {
    private  String[] FARBEN = {"Kreuz", "Pik", "Herz", "Karo"};
    private  String[] TYP = {"Ass", "Koenig", "Dame", "Bube", "10", "9", "8","7","6","5","4","3","2"};
    private int players;
    private int cardNums;

    public CardSet(int players, int cardNums)
    {
        this.players=players;
        this.cardNums=cardNums;
    }

    public void shuffelCards()
    {
        ArrayList<String> deck=new ArrayList<>();
        for (String farbe : FARBEN) {
            for (String typ : TYP) {
                deck.add(typ + "" + farbe);
            }
        }
    }
}
