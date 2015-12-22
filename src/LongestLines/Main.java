package LongestLines;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main{

    public static void main(String[] args) throws IOException {
        ArrayList<String> arr = new ArrayList<>();
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        boolean primera = false;
        int veces = -1;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                if(!primera){
                    primera = true;
                    veces = Integer.parseInt(line);
                }else{
                    arr.add(line);
                }
            }
        }
        Comparator<String> longitud = (String b1, String b2) -> (int) (b2.length() - b1.length());
        Collections.sort(arr, longitud);
        for(int i=0; i<veces; i++){
            System.out.println(arr.get(i));
        }
    }
}
