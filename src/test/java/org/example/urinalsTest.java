package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;

/**
 * Unit test for simple App.
 */
public class urinalsTest
{
    @Test
    void goodString() {
        System.out.println("====== Akansh Kumar == TEST TWO EXECUTED =======");
        urinals testUrinals = new urinals();
        Assertions.assertEquals( false , testUrinals.goodString("test1") );
        Assertions.assertEquals(true ,testUrinals.goodString("101010101010101"));
        Assertions.assertEquals(false,testUrinals.goodString("102301"));
        Assertions.assertEquals(true,testUrinals.goodString("000000"));
        Assertions.assertEquals(true,testUrinals.goodString("111111111"));
        Assertions.assertEquals(false,testUrinals.goodString("-1"));
        Assertions.assertEquals(false,testUrinals.goodString("111111111111110000000000000"));
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


    @Test
    void readInput() {
        System.out.println("====== Akansh Kumar == TEST readInput EXECUTED =======");
        urinals testUrinals = new urinals();
        String str = testUrinals.readInput("./src/test/java/resources/urinalTest.dat");
        Assertions.assertEquals("1001000", str);
        String str2 = testUrinals.readInput("./src/test/java/resources/urinalTest2.dat");
        Assertions.assertEquals("", str2);


    }

    @Test
    void writeOutput() {
        System.out.println("====== Akansh Kumar == TEST writeOutput EXECUTED =======");
        urinals testUrinals = new urinals();
        int testResult = 3;
        testUrinals.writeOutput(testResult);
        File f = new File("./rule.txt");
        StringBuilder stringBuilder = new StringBuilder();
        Assertions.assertEquals(true , f.exists());
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(f));
            int c;
            //read file line by line
            while ((c = br.read()) != -1){
                char character = (char) c;
                stringBuilder.append(character);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("3", stringBuilder.toString());

    }
}
