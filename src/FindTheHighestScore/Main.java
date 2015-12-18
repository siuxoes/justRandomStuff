package FindTheHighestScore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] ar = line.split(" \\| ");
            StringBuilder texto  = new StringBuilder();
            String result = "";
            int cont = 0;
            while(cont<ar[0].split(" ").length) {
                for (int i = 0; i < ar.length; i++) {
                    texto.append(ar[i].split(" ")[cont] + " ");
                }
                result += higherNumber(texto.toString()) + " ";
                texto.setLength(0);
                cont++;
            }
            result = result.substring(0, result.length()-1);
            System.out.println(result);
        }

    }

    public static int higherNumber(String n){
        String[] testArray = n.split(" ");
        int max = Integer.MIN_VALUE, maxIndex = 0;
        for (int i = 0; i < testArray.length; i++) {
            if (Integer.parseInt(testArray[i]) > max) {
                max = Integer.parseInt(testArray[i]);
                maxIndex = i;
            }
        }
        return max;
    }
}
