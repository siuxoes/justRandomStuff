package MixedContent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/15/2015.
 */
public class Main {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        } catch (NullPointerException e) {
            return false;
        }
        return true;
    }

    public static void dividirPorCategoria(String s) {
        String[] t = s.split(",");
        StringBuilder builderN = new StringBuilder();
        StringBuilder builderP = new StringBuilder();
        String delim = "";
        String delim2 = "";
        for (String string : t) {
            if (isInteger(string)) {
                builderN.append(delim).append(string);
                delim = ",";
            } else {
                builderP.append(delim2).append(string);
                delim2 = ",";
            }
        }
        String numeros = builderN.toString();
        String palabras = builderP.toString();
        if(numeros.length() == 0){
            System.out.println(palabras);
        }else if(palabras.length() == 0){
            System.out.println(numeros);
        }else{
            System.out.println(palabras + "|" + numeros);
        }
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            dividirPorCategoria(line);
        }
    }

}
