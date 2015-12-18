package RealFake;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
            line = line.replace(" ", "");
            int suma = 0;
            for(int i=0; i<line.length();i+=2){
                suma += Integer.parseInt(String.valueOf(line.charAt(i))) * 2;
            }
            for(int i=1; i<line.length();i+=2){
                suma += Integer.parseInt(String.valueOf(line.charAt(i)));
            }
            if(suma%10==0){
                System.out.println("Real");
            }else{
                System.out.println("Fake");
            }
        }
        String s = "9999 9999 9999 9999";

    }
}
