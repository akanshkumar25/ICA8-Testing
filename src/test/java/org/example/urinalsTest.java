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
        Assertions.assertFalse( testUrinals.goodString("test1") );
        Assertions.assertTrue(testUrinals.goodString("101010101010101"));
        Assertions.assertFalse(testUrinals.goodString("102301"));
        Assertions.assertTrue(testUrinals.goodString("000000"));
        Assertions.assertTrue(testUrinals.goodString("111111111"));
        Assertions.assertFalse(testUrinals.goodString("-1"));
        Assertions.assertFalse(testUrinals.goodString("111111111111110000000000000"));
    }

    @Test
    void countFreeUrinals() {
        System.out.println("====== Akansh Kumar == TEST countFreeUrinals EXECUTED =======");
        urinals testUrinals = new urinals();
        Assertions.assertEquals(1 , testUrinals.countFreeUrinals("1010001"));
        Assertions.assertEquals(0 , testUrinals.countFreeUrinals("101001"));
        Assertions.assertEquals(2, testUrinals.countFreeUrinals("000001"));
        Assertions.assertEquals(0 , testUrinals.countFreeUrinals("1111111"));
        Assertions.assertEquals(0 , testUrinals.countFreeUrinals("1100111"));



    }
}
