package WithoutRepetitions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\3.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
    while ((line = buffer.readLine()) != null) {
        line = line.trim();
        if (line.length() == 0) {
            System.out.println(line);
            continue;
        }
        char anterior = ' ';
        StringBuilder sb = new StringBuilder();
        for (char c : line.toCharArray()) {
            if (c == anterior) {
                anterior = c;
            } else {
                sb.append(c);
                anterior = c;
            }
        }
        System.out.println(sb.toString());
    }

}
}
