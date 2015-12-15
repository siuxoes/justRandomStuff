package CapitalizeWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/12/2015.
 */
public class Main {

    public static String capitalizeWords(String s){
        String[] array = s.split(" ");
        String result = "";
        for(String string: array){
            result += Character.toUpperCase(string.charAt(0)) + string.substring(1) + " ";
        }
        return result.substring(0, result.length()-1);
    }

    public static void main (String[] args)
            throws IOException
    {
        File file = new File(args[0]);
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            line = line.trim();
            System.out.println(capitalizeWords(line));
        }
    }
}
