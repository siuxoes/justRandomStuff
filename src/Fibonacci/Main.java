package Fibonacci;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static int fibonacciRecusion(int number){
        if(number == 1 || number == 2){
            return 1;
        }

        return fibonacciRecusion(number-1) + fibonacciRecusion(number -2); //tail recursion
    }

    public static long FiboRecursivo(int pos){
        long retornado=0;
        if(pos==0 || pos==1){
            retornado=pos;
        }else{
            retornado=FiboRecursivo(pos-2)+FiboRecursivo(pos-1);
        }
        return retornado;
    }


    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                System.out.println(FiboRecursivo(Integer.parseInt(line)));
            }
        }
    }
}
