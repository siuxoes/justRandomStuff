package StepWiseWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static String getLongestString(String[] array) {
        int maxLength = 0;
        String longestString = null;
        for (String s : array) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;
            }
        }
        return longestString;
    }

    public static String transForm(String s){
        String result = "";
        for(int i=0; i<s.length(); i++){
            result += veces(i) +s.charAt(i) + " ";
        }
        return result;
    }

    public static String veces(int v){
        String a = "";
        for(int i=0; i<v;i++){
            a+="*";
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String longest = getLongestString(line.split(" "));
            String l = transForm(longest);
            l = l.substring(0, l.length()-1);
            System.out.println(l);
        }

    }
}
