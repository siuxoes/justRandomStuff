package OneZerosTwoZeros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static int contar(int numeroZeros, int max){
        int cont = 0;
        for(int i=1; i<=max;i ++){
            if(contarZeros(String.valueOf(i)) == numeroZeros){
                cont++;
            }
        }
        return  cont;
    }

    public static int contarZeros(String n){
        int cont = 0;
        for(char a: Integer.toBinaryString(Integer.parseInt(n)).toCharArray()){
            if(a == '0'){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                String[] arr = line.split(" ");
                System.out.println(contar(Integer.parseInt(arr[0]), Integer.parseInt(arr[1])));
            }
        }
    }
}
