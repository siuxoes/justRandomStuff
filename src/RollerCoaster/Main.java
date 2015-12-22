package RollerCoaster;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

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
            boolean tocaMayuscula = true;
            StringBuilder stringBuilder = new StringBuilder();
            for(char c: line.toCharArray()){
                if(Character.isAlphabetic(c)){
                    if(tocaMayuscula){
                        stringBuilder.append(Character.toUpperCase(c));
                        tocaMayuscula = false;
                    }else{
                        stringBuilder.append(Character.toLowerCase(c));
                        tocaMayuscula = true;
                    }
                }else{
                    stringBuilder.append(c);
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}
