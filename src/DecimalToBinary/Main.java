package DecimalToBinary;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static String devolverBinario(int n){
        return Integer.toBinaryString(n);
    }
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(devolverBinario(Integer.parseInt(line)));
        }
    }
}
