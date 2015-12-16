package ArraysSort;

import java.util.Arrays;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{-3, 29, -3};
        Arrays.sort(array);
        for(int n: array){
            System.out.println(n);
        }
    }
}
