package LetterCasePercentageRatio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static void mostrar(String t) {
        double lower = 0;
        double upper = 0;
        for (char c : t.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upper++;
            } else {
                lower++;
            }
        }
        System.out.format("lowercase: %.2f uppercase: %.2f\n", (lower / t.length()) * 100, (upper / t.length()) * 100);
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
