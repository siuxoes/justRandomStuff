package StringRotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by siuxoes on 12/15/2015.
 */
public class Main {

    public static Set<Character> stringToCharacterSet(String s) {
        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set;
    }

    public static boolean containsAllChars
            (String container, String containee) {
        return stringToCharacterSet(container).containsAll
                (stringToCharacterSet(containee));
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] array = line.split(",");
            if(containsAllChars(array[0], array[1])){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }

}
