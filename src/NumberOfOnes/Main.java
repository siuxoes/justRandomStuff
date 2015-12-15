package NumberOfOnes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/13/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                line = Integer.toBinaryString(Integer.parseInt(line)).replace("0", "");
                System.out.println(line.length());
            }
        }
    }
}
