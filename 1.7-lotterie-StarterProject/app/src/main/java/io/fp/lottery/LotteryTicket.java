package io.fp.lottery;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LotteryTicket {
    
    private String playerName;
    private Set<Integer> selectedNumbers;

    public LotteryTicket(String playerName, int... selectedNumbers) throws LotteryException {
        this.playerName = playerName;
        this.selectedNumbers = new TreeSet<>();
        for (int i : selectedNumbers) {
            if(!this.selectedNumbers.add(i)){
               throw new LotteryException(playerName + " submitted a invalid lotteryticket: "+ i + " is a duplicate"); 
            }
        }        
    }

    public Set<Integer> getNumbers() {
        return selectedNumbers;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Set<Integer> getWrongNumbers(Set<Integer> drawedNumbers){
        Set<Integer> wrongNums=new HashSet<>(selectedNumbers);
        wrongNums.removeAll(drawedNumbers);
        return wrongNums;
    }

    public Set<Integer> getCorrectNumbers(Set<Integer> drawedNumbers){
        Set<Integer> correctNums=new HashSet<>();
        correctNums.addAll(selectedNumbers);
        correctNums.retainAll(drawedNumbers);
        return correctNums;
    }

    
    public Set<Integer> getMissingNumbers(Set<Integer> drawedNumbers){
        Set<Integer> missingNums=new HashSet<>();
        missingNums.addAll(drawedNumbers);
        missingNums.removeAll(selectedNumbers);
        return missingNums;
    }


    public void printLotteryStatistic(Set<Integer> drawedNumbers) throws LotteryException{
        System.out.println("\n----Lottery Statistic----\n");
        System.out.println(this.toString());
        System.out.println("Wrong Numbers: " +getWrongNumbers(drawedNumbers));
        System.out.println("Correct Numbers:" +getCorrectNumbers(drawedNumbers));
        System.out.println("Missing Numbers:" +getMissingNumbers(drawedNumbers));

    }

    @Override
    public String toString() {
        return "LotteryTicket from " + playerName + " with numbers=" + selectedNumbers;
    }
 

    
}
