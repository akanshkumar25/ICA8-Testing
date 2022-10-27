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
        result = testUrinals.goodString("101010101010101");
        Assertions.assertTrue(result);
        result = testUrinals.goodString("102301");
        Assertions.assertFalse(result);
        result = testUrinals.goodString("000000");
        Assertions.assertTrue(result);
        result = testUrinals.goodString("111111111");
        Assertions.assertTrue(result);
        result = testUrinals.goodString("-1");
        Assertions.assertFalse(result);
        result = testUrinals.goodString("111111111111110000000000000");
        Assertions.assertFalse(result);
    }
}
