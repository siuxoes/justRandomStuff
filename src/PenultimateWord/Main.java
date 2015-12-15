package PenultimateWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/12/2015.
 */
public class Main {

    public String penultimateWord(String s) {
        String[] array = s.split(" ");
        return array[array.length - 2];
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.length() != 0) {
                System.out.println(m.penultimateWord(line));
            }
        }
    }
}
