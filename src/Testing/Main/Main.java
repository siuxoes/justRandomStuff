package Testing.Main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static int mismatches(String s){
        String[] division = s.split("\\|");
        String first = division[0].replace(" ", "");
        String second = division[1].replace(" ", "");
        int dife = 0;
        for(int i=0; i<first.length();i++){
            if(first.charAt(i) != second.charAt(i)){
                dife++;
            }
        }
       return dife;
    }

    public static void mostrarMensaje(int n){
        if(n == 0){
            System.out.println("Done");
        }
        else if(n <= 2){
            System.out.println("Low");
        }else if(n <= 4){
            System.out.println("Medium");
        }else if(n <= 6){
            System.out.println("High");
        }else if(n > 6){
            System.out.println("Critical");
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                mostrarMensaje(mismatches(line.replace(" ", "")));
            }
        }
    }
}
