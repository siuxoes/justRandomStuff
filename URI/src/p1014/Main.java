package p1014;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(in.nextLine());
        double d = Double.parseDouble(in.nextLine());
        System.out.format("%.3f km/l\n", n / d);
    }
}
