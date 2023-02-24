package io.fp;

import java.util.Random;

public class PrimeGame  {
    private Level currentLevel;
    private int currentNumber;

    public PrimeGame()
        {
            currentLevel=Level.SIMPLE;
        }
    
    public void currentNextNumber()
        {
            Random r=new Random();
            switch(currentLevel){
                case SIMPLE:
                currentNumber=r.nextInt(99);
                break;
                case INTERMEDIATE:
                currentNumber=r.nextInt(999);
                break;
                case ADVANCED:
                currentNumber=r.nextInt(9999);
                break;
            }
        }

    public void nextCurrentLevel()throws Exception
    {
        if(currentLevel.equals(Level.SIMPLE))
        {
            currentLevel=Level.currentLevel(1);
        }else if(currentLevel.equals(Level.INTERMEDIATE))
        {
            currentLevel=Level.currentLevel(2);
        }
        System.out.println("Level geandert. Die Schwierigkeitsstufe ist nun: " + currentLevel.toString());
    }

    

    public static boolean isPrime(int answer)
    {
        boolean isPrime=true;
        for(int i=answer-1; i>1; i--)
        {
            if(answer%i==0) isPrime=false;
        }
        return isPrime;
    }

    public Level getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Level currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }
    
    
}
