package ReverseWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static void mostrar(String s){
        String[] array = s.split(" ");
        if(array.length == 2){
            String temp = array[1];
            array[1] = array[0];
            array[0] = temp;
            System.out.println(array[0] + " " + array[1]);
        }else if(array.length == 1){
            System.out.println(array[0]);
        }else{
            System.out.println("");
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                mostrar(line);
            }
        }
    }

}
