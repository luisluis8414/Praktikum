package io.fp.lottery;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Lottery {

    private Set<LotteryTicket> tickets;
    private int numberOfDraws;
    private int rangeOfNumbers;
    private double jackpot;
    private Set<Integer> drawedNumbers;
    private int numberOfWinners = 0;

    public Lottery() {
        this.tickets = new HashSet<>();
        this.numberOfDraws = 7;
        this.rangeOfNumbers = 49;
        this.jackpot = 1000000;
        this.drawedNumbers = new TreeSet<>();
    }

    public Lottery(int numberOfDraws, int rangeOfNumbers) {
        this.tickets = new HashSet<>();
        this.numberOfDraws = numberOfDraws;
        this.rangeOfNumbers = rangeOfNumbers;
        this.jackpot = 1000000;
        this.drawedNumbers = new TreeSet<>();
    }


    public void submitTicket(LotteryTicket ticket) {
        tickets.add(ticket);
    }

    public Set<Integer> getDrawedNumbers(){
        return drawedNumbers;
    }

   
    private void drawNumbers() throws LotteryException {
        if (numberOfDraws >= rangeOfNumbers) {
            throw new LotteryException("Impossible game defined!");
        }
        Random rand = new Random();
        while (drawedNumbers.size() != numberOfDraws) {
            int drawedNumber = rand.nextInt(rangeOfNumbers)+ 1;
            drawedNumbers.add(drawedNumber);
        }
    }

    public void checkTicket(LotteryTicket ticket){
        
        if(ticket.getNumbers().equals(drawedNumbers)) 
        {
            numberOfWinners++;
            System.out.println(ticket.getPlayerName() + " has won the Lottery");
        }else System.out.println(ticket.getPlayerName() + " has a loosing ticket");
    }

    public void lotteryDraw() throws LotteryException {
        drawNumbers();
        for (LotteryTicket ticket : tickets) {
            checkTicket(ticket);
        }
        System.out.println("The drawed numbers are " + drawedNumbers);
        if (numberOfWinners > 0)
            System.out.println("Each winner gets " + jackpot / numberOfWinners + "Euro !");
    }
}
