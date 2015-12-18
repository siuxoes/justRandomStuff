package p1010;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int id, cantidad;
        double precio;
        double total = 0;
        for(int i=0; i<2;i++){
            String line = in.nextLine();
            id = Integer.parseInt(line.split(" ")[0]);
            cantidad = Integer.parseInt(line.split(" ")[1]);
            precio = Double.parseDouble(line.split(" ")[2]);
            total += cantidad * precio;
        }
        System.out.format("VALOR A PAGAR: R$ %.2f\n", total);
    }

}
