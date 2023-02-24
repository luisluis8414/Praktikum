package io.fp;

public enum Level {
    SIMPLE,
    INTERMEDIATE,
    ADVANCED;


public static Level currentLevel(int index) throws Exception
    {
       if(index==1) return Level.INTERMEDIATE;
       else if(index==2) return Level.ADVANCED;
        else throw new Exception("No good");
    }


    
}