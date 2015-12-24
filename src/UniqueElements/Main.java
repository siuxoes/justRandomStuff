package UniqueElements;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() == 0){
                continue;
            }

            HashSet<Integer> seT = new HashSet<>();
            for(String s: line.split(",")){
                seT.add(Integer.parseInt(s));
            }
            List<Integer> lista = new ArrayList<>();
            lista.addAll(seT);
            Collections.sort(lista);
            String texto = "";
            for(Integer t:  lista){
                texto += t+ ",";
            }
            System.out.println(texto.substring(0, texto.length()-1));
        }
    }
}
