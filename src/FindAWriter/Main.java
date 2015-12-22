package FindAWriter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                String[] arr = line.split("\\|");
                String decode = arr[0];
                String keys = arr[1].trim();
                StringBuilder stringBuilder = new StringBuilder();
                for(String t: keys.split(" ")){
                    stringBuilder.append(decode.charAt(Integer.parseInt(t)-1));
                }
                System.out.println(stringBuilder.toString());
            }
        }
    }
}
