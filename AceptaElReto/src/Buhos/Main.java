package Buhos;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args){
        String entrada=in.nextLine().toLowerCase();
        while(!entrada.equalsIgnoreCase("XXX")){
            entrada = entrada.replaceAll("[^a-z]","");
            entrada = entrada.replaceAll(" ", "");
            StringBuffer nuevo = new StringBuffer(entrada);
            if(entrada.equals(nuevo.reverse().toString().replaceAll(" ", "")))
                System.out.println("SI");
            else
                System.out.println("NO");
            entrada=in.nextLine().toLowerCase();
        }
    }
}
