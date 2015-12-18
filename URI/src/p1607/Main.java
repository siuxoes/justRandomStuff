package p1607;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static int differences(String a, String b){
        int sum = 0;
        for(int i=0; i<a.length(); i++){
            sum += Math.abs(((Character.getNumericValue(b.charAt(i))) - (Character.getNumericValue(a.charAt(i)))));
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(differences("abcdefghiz", "aaaaaaaaaa"));
    }
}
