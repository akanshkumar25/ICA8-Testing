package org.example;

import java.util.ArrayList;

/**
 * ICA8-Testing
 * Author: Akansh Kumar
 */
public class urinals
{
    public void getString() {

    }

    public int countFreeUrinals ( String str) {
        return 0;
    }

    public void openfile() {

    }

    public void countUrinals() {}

    public Boolean goodString( String str ) { // checks to see if valid string
        if (str.length() > 20)
            return false;
        char[] arr = str.toCharArray();
        for (char c: arr) {
            if(Character.isLetter(c))
                return false;
            else if (!(c == '0' || c == '1'))
                return false;
        }
        return true;
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
