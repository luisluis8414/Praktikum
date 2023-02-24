package fp.karteikarten;

import java.util.Scanner;
import java.util.ArrayList;

public class Abfrage
{
    private Modul modul;
    public static void main(String[] args) {
         new Abfrage().start();
    }
    
    public Abfrage(){
        modul = new Modul("Quiz");
        Card card1 = new Card("2 plus 2","4");
        Card card2 = new Card("2 plus 4","6");
        Card card3 = new Card("2 plus 6","8");
        Card card4 = new Card("2 plus 8","10");
        modul.addCard(card1);
        modul.addCard(card2);
        modul.addCard(card3);
        modul.addCard(card4);
    }
    
    public Abfrage(Modul m){
        this.modul = m;
    }
    
    public void start(){
        System.out.println("Beantworte die naechsten Fragen richtig");
        while(modul.hasNextCard()) {
            Card card= modul.getNextCard();
            System.out.println(card.getQuestion());
            Scanner sc = new Scanner(System.in);
            String antwort = sc.nextLine();
            if(card.isAnswerCorrect(antwort)){
                modul.correct();
                System.out.println("Richtige Antwort");
            }else{
                System.out.println("Falsche Antwort");
            }
        }
        System.out.println("Du hast " + modul.getCorrectCards() + " Karten richtig, aus insgesamt " + modul.getNumberOfCards()
         + " Karten.");
    }
}