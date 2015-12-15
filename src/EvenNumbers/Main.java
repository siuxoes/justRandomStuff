package EvenNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/12/2015.
 */
public class Main {

    public void evenNumber(int n){
        if ( (n & 1) == 0 )
        {
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
    public static void main(String[] args) throws IOException {
        Main m = new Main();
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                m.evenNumber(Integer.parseInt(line));
            }
        }
    }
}
