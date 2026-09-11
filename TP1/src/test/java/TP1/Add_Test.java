package TP1;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class Add_Test {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void Test() {

   
        Add addition = new Add();
        int resultat = addition.add(2, 3);
        assertEquals(5, resultat);


        
    }
}