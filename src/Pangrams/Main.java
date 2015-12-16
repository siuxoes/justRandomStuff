package Pangrams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static String comprobar(String s) {
        s = s.replace(" ", "");
        s = s.toLowerCase();
        StringBuilder txto = new StringBuilder();
        for(char j='a'; j<='z'; j++){
            if(!s.contains(String.valueOf(j))){
                txto.append(j);
            }
        }
        if(txto.length() == 0){
            return "NULL";
        }else
            return txto.toString();
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(comprobar(line));
        }
    }
}
