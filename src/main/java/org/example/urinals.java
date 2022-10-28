package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * ICA8-Testing
 * Author: Akansh Kumar
 */
public class urinals
{
    public String readInput( String inputFilePath ) {
        String path = new File(inputFilePath).getAbsolutePath();
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader br = null;
        try{
            //create file object
            File file = new File(path);
            //create BufferedReader object from the File
            br = new BufferedReader(new FileReader(file));
            int c;
            //read file line by line
            while ((c = br.read()) != -1){
                char character = (char) c;
                stringBuilder.append(character);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(br != null){
                try {
                    br.close();
                }catch(Exception e){}
            }
        }
        return stringBuilder.toString();
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

    public void writeOutput(int result) {
        System.out.println("not yet implemented");
    }

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
