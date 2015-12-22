package FirstNonRepeatedChar;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    public static int countOccurrences(String haystack, char needle)
    {
        return countOccurrences(haystack, needle, 0);
    }

    private static int countOccurrences(String haystack, char needle, int index)
    {
        if (index >= haystack.length())
        {
            return 0;
        }

        int contribution = haystack.charAt(index) == needle ? 1 : 0;
        return contribution + countOccurrences(haystack, needle, index+1);
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                for(char c: line.toCharArray()){
                    if(countOccurrences(line, c) == 1){
                        System.out.println(c);
                        break;
                    }
                }
            }
        }

    }
}
