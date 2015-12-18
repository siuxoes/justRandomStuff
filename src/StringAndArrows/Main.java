package StringAndArrows;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/18/2015.
 */
public class Main {

    public static int count(final String string, final String substring)
    {
        int count = 0;
        int idx = 0;
        while ((idx = string.indexOf(substring, idx)) != -1)
        {
            idx++;
            count++;
        }
        return count;
    }

    public static void main(String[] args) throws IOException {
        String una = ">>-->";
        String otra = "<--<<";
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(count(line, una) + count(line, otra));
        }

    }
}
