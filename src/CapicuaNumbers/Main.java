package CapicuaNumbers;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    private static Scanner in = new Scanner(System.in);

    public static boolean isCapicua(int n){
        String t = String.valueOf(n);
        return t.equalsIgnoreCase(new StringBuilder(t).reverse().toString());
    }

    public static int contar(int numeroCifras){
        int min;
        if(numeroCifras==1){
            min = 0;
        }else{
            min =(int) Math.pow(10, numeroCifras-1);
        }
        int maxn =(int) Math.pow(10, numeroCifras)-1;
        int cont = 0;
        for(int i=min; i<=maxn;i++){
            if(isCapicua(i)){
                cont++;
            }
        }
        return cont;
    }
    public static void main(String[] args) {
        int n;
        while((n=Integer.parseInt(in.nextLine())) != 0){
            System.out.println(contar(n));
        }
    }
}
