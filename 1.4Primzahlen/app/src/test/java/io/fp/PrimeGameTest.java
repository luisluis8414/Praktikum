package io.fp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeGameTest {
    
    @Test
    void testIsPrimeCorrect()
    {
        assertEquals(true,PrimeGame.isPrime(7));
    }

    @Test
    void testIsPrimeInCorrect()
    {
        assertEquals(false, PrimeGame.isPrime(10));
    }

    @Test
    void testNextCurrentLevelSimple()
    {
        PrimeGame p=new PrimeGame();
        
    }
}
