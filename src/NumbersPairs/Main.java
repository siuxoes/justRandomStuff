package NumbersPairs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/13/2015.
 */
public class Main {

    public static void pares(String s){
        String[] primeraDivision = s.split(";");
        int suma = Integer.parseInt(primeraDivision[1]);
        String[] segunda = primeraDivision[0].split(",");
        String result = "";
        for(int i = 0; i < segunda.length; i++){
            int numerosDelante = segunda.length - (i+1);
            if(numerosDelante > 0){
                for(int j = i+1; j < segunda.length; j++){
                    if((Integer.parseInt(segunda[i]) + Integer.parseInt(segunda[j]))  == suma ){
                        result += segunda[i] + "," + segunda[j] + ";";
                    }
                }
            }
        }
        if(result.length() == 0){
            System.out.println("NULL");
        }else{
            result = result.substring(0, result.length()-1);
            System.out.println(result);
        }
    }
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                pares(line);
            }
        }
    }
}

