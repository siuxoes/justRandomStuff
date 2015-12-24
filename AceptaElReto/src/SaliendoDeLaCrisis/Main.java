package SaliendoDeLaCrisis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    private static Scanner in = new Scanner(System.in);

    public static boolean isSorted(List<Integer> list)
    {
        boolean sorted = true;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i-1).compareTo(list.get(i)) >= 0) sorted = false;
        }

        return sorted;
    }

    public static void main(String[] args) {

        int casos = -1;
        while((casos=Integer.parseInt(in.nextLine()))!=0){
            String s = in.nextLine();
            List<Integer> list = new ArrayList<>();
            for(String t: s.split(" ")){
                list.add(Integer.parseInt(t));
            }
            if(isSorted(list)){
                System.out.println("SI");
            }else{
                System.out.println("NO");
            }
        }
    }
}
