package Combinations;

import java.io.*;
import java.util.*;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static ArrayList<String> ar = new ArrayList<>();

    public static void possibleStrings(int maxLength, List<Character> alphabet, StringBuilder curr) {
        if (curr.toString().length() == maxLength) {
            ar.add(curr.toString());
        } else {
            for (char c : alphabet) {
                String oldCurr = curr.toString();
                curr.append(c);
                possibleStrings(maxLength, alphabet, curr);
                curr =new StringBuilder(oldCurr);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Character> arrayList = new ArrayList<>();
        for (char i = 'a'; i <= 'z'; i++) {
            arrayList.add(i);
        }
        Main.possibleStrings(1, arrayList, new StringBuilder(""));
        Main.possibleStrings(2, arrayList,  new StringBuilder(""));
        Main.possibleStrings(3, arrayList,  new StringBuilder(""));
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                int n = Integer.parseInt(line);
                System.out.println(ar.get(n - 1));
            }
        }
    }
}
