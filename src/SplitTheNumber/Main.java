package SplitTheNumber;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/15/2015.
 * https://www.codeeval.com/open_challenges/131/
 */
public class Main {

    public static void thirdTry(String t){
        String izquierda = t.substring(0, t.indexOf(" "));
        String derecha = t.substring(t.indexOf(" ")+1);
        int primero, segundo;
        if(derecha.contains("+")){
            primero = Integer.parseInt(izquierda.substring(0, derecha.indexOf("+")));
            segundo = Integer.parseInt(izquierda.substring(derecha.indexOf("+")));
            System.out.println(primero + segundo);
        }else{
            primero = Integer.parseInt(izquierda.substring(0, derecha.indexOf("-")));
            segundo = Integer.parseInt(izquierda.substring(derecha.indexOf("-")));
            System.out.println(primero - segundo);
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            thirdTry(line);
        }
    }
}
