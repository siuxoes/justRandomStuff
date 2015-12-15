package LongestWrod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/15/2015.
 */
public class Main {

    public static String longestWord(String sentence) {
        return longest(sentence.split("\\s+"), 0, 0);
    }

    private static String longest(String[] words, int idx, int longest) {
        if (idx == words.length)
            return words[longest];
        return longest(words, idx+1,
                words[idx].length() > words[longest].length() ? idx : longest);
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(longestWord(line));
        }
    }
}
