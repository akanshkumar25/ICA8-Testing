package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * ICA8-Testing
 * Author: Akansh Kumar
 */
public class urinals
{
    public void getString() {

    }

    public int countFreeUrinals ( String str) {
        String[] splitArray = str.split("");
        int[] arr = new int[splitArray.length];

        for (int i = 0; i < splitArray.length; i++) {
            arr[i] = Integer.parseInt(splitArray[i]);
        }
        int count = 0;
        for(int i=0; i< arr.length ; i++){
            if(arr[i] == 0){
                if(i==0){
                    if(arr[i+1] == 0){
                        arr[i] = 1;
                        count++;
                    }
                }
                else if(i== arr.length -1) {
                    if(arr[i -1]==0){
                        arr[i] = 1;
                        count++;
                    }
                }
                else{
                    if( arr[i-1] == 0 && arr[i+1]==0){
                        arr[i] = 1;
                        count++;
                    }
                }

            }
        }
        return count;
    }

    public void openfile() {

    }

    public void countUrinals() {}

    public boolean goodString( String str ) { // checks to see if valid string
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
