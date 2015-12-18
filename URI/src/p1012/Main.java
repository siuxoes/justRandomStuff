package p1012;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        String n = in.nextLine();
        double d1 = Double.parseDouble(n.split(" ")[0]);
        double d2 = Double.parseDouble(n.split(" ")[1]);
        double d3 = Double.parseDouble(n.split(" ")[2]);
        System.out.format("TRIANGULO: %.3f\n" +
                "CIRCULO: %.3f\n" +
                "TRAPEZIO: %.3f\n" +
                "QUADRADO: %.3f\n" +
                "RETANGULO: %.3f\n",
                (d1 * d3)/2,
                (3.14159 * Math.pow(d3, 2)),
                ((d1+d2)/2)*d3,
                d2 * d2,
                d1 * d2);
    }

}
