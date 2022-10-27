package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class urinalsTest
{
    @Test
    void goodString() {
        System.out.println("====== Akansh Kumar == TEST TWO EXECUTED =======");
        urinals testUrinals = new urinals();
        boolean result = testUrinals.goodString("test1");
        Assertions.assertFalse( result );
    }
}
