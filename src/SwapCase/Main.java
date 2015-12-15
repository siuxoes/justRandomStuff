package SwapCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/15/2015.
 */
public class Main {

    public static void mostrar(String t){
        StringBuilder sb = new StringBuilder(t);
        for (int index = 0; index < sb.length(); index++) {
            char c = sb.charAt(index);
            if (Character.isLowerCase(c)) {
                sb.setCharAt(index, Character.toUpperCase(c));
            } else {
                sb.setCharAt(index, Character.toLowerCase(c));
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            mostrar(line);
        }
    }

}
