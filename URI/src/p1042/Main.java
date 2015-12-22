package p1042;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by siuxoes on 12/19/2015.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = in.nextLine();
        String[] arr = s.split(" ");
        ArrayList<Integer> lista = new ArrayList<>();
        for(String t: arr){
            lista.add(Integer.parseInt(t));
        }
        Collections.sort(lista);
        for(Integer t: lista){
            System.out.println(String.valueOf(t));
        }
        System.out.println();
        for(String t: arr){
            System.out.println(t);
        }
    }
}
