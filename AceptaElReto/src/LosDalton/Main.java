package LosDalton;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by siuxoes on 12/18/2015.
 */
public class Main {

    private static Scanner in = new Scanner(System.in);

    public static boolean isSorted(List<String> list)
    {
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).compareTo(list.get(i)) >= 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        while((Integer.parseInt(in.nextLine())) != 0){
            List<String> arr = new ArrayList<>(Arrays.asList(in.nextLine().split(" ")));
            if(isSorted(arr)){
                System.out.println("DALTON");
            }else{
                System.out.println("DESCONOCIDOS");
            }
        }
    }
}
