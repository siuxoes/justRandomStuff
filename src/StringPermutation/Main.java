package StringPermutation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by siuxoes on 12/24/2015.
 */
public class Main {

    private static boolean primera = false;

    public static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        String texto = "";
        int n = str.length();
        if (n == 0) System.out.print("," + prefix);
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    public static String nextCombination(int pos, char[] arr) {
        String texto = "";
        for (int i = 0; i < arr.length; i++) {
            if (pos != i) {
                texto += i + " ";
            }
        }
        return texto.trim() + " " + new StringBuilder(texto.trim()).reverse().toString();
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.length() == 0) {
                continue;
            }

           /* String input = line;
            String result = "";
            String actual = "";
            char[] arr = input.toCharArray();
            int veces = 0;
            for(int i=0; i<arr.length;i++){
                actual += arr[i];
                for(String s: nextCombination(i, arr).split(" ")){
                    actual += input.charAt(Integer.parseInt(s));
                    veces++;
                    if(veces == arr.length-1){
                        veces = 0;
                        result += actual+",";
                        actual =  String.valueOf(arr[i]);
                    }
                }
                actual = "";
            }
            String[] s = result.substring(0, result.length()-1).split(",");
            List<String> listaOrdenada = new ArrayList<>(Arrays.asList(s));
            Collections.sort(listaOrdenada);
            String texto = "";
            for(String t: listaOrdenada){
                texto += t+",";
            }
            System.out.println(texto.substring(0, texto.length()-1));*/
            permutation(line);
            System.out.println();
        }

    }
}
