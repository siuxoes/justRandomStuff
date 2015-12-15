package SwapElements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/15/2015.
 */
public class Main {

    private static String[] arrayDo;

    public static void swapElements(String[] array, int first, int second){
        String fFirst = array[first];
        String fSecond =  array[second];
        array[second] = fFirst;
        array[first] = fSecond;
    }

    public static void cargarArray(String s){
        arrayDo = s.split(" ");
    }

    public static int devolverFirst(String s){
        return Integer.parseInt(s.substring(0, s.indexOf("-")));
    }

    public static int devolverSecond(String s){
        return Integer.parseInt(s.substring(s.indexOf("-")+1));
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] array = line.split(" : ");
            String[] arra2 = array[1].split(", ");
            cargarArray(array[0]);
            for(String t: arra2){
                swapElements(arrayDo, devolverFirst(t), devolverSecond(t));
            }
            String texto = "";
            for(String t: arrayDo){
                texto += t + " ";
            }
            System.out.println(texto.substring(0, texto.length()-1));
        }
    }

}
