package fp.karteikarten;

import java.util.*;
public class Modul
{
    private String name;
    private ArrayList<Card> cards;
    private int currentCardIndex=0;
    private int correctCards;
    
    public Modul(String name)
    {
        this.name = name;
        cards = new ArrayList<>();
    }

    public void addCard(Card card){
        if(card == null){
            System.out.println("Null ist keine Karte");
        }else if(cards.contains(card)){
            System.out.println("Diese Karte ist bereits vorhanden");
            return ;
        }else{
            cards.add(card);
        }
    }
    
    public String getName(){
        return name;
    }
    
    public void correct(){
        correctCards++;
    }
    
    public int getCorrectCards(){
        return correctCards;
    }
        
    public int getNumberOfCards(){
        return cards.size();
    }
    
    public boolean hasNextCard(){
        if(currentCardIndex>cards.size()-1){
            return false;
        }else{
            return true;
        }
    }
    
    public Card getNextCard(){
        Card c = cards.get(currentCardIndex);
        currentCardIndex++;
        return c;
    }
}
