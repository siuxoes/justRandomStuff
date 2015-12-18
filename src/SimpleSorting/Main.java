package SimpleSorting;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
/**
 * Created by siuxoes on 12/18/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            ArrayList<Double> newArray = new ArrayList<>();
            String[] ar = line.split(" ");
            for(String t: ar){
                newArray.add(Double.parseDouble(t));
            }
            Collections.sort(newArray);
            String texto = "";
            for(Double p: newArray){
                String t = String.format("%.3f", p);
                texto += t + " ";
            }
            System.out.println(texto.substring(0, texto.length()-1));
        }
    }
}
