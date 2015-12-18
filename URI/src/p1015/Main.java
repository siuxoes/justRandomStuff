package p1015;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String n = in.nextLine();
        String m = in.nextLine();
        double d1  = Double.parseDouble(n.split(" ")[0]);
        double d2  = Double.parseDouble(n.split(" ")[1]);
        double d3  = Double.parseDouble(m.split(" ")[0]);
        double d4  = Double.parseDouble(m.split(" ")[1]);
        System.out.printf("%.4f\n", Math.sqrt((Math.pow(d3-d1,2)) + (Math.pow(d4-d2,2))));
    }
}
