package CleanUpTheWords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() == 0){
                continue;
            }
            line = line.toLowerCase();
            String texto = "";
            boolean signo = false;
            for(Character c: line.toCharArray()){
                if(Character.isAlphabetic(c)){
                    if(signo){
                        texto += " ";
                    }
                    texto += c;
                    signo = false;
                }else{
                    signo = true;
                }
            }
            System.out.println(texto.trim());
        }

    }
}
