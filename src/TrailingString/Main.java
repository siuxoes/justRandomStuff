package TrailingString;

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
                String[] arr = line.split(",");
                if(arr[0].endsWith(arr[1])){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }

    }
}
