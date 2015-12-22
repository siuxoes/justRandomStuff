package p1287;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/19/2015.
 */
public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String input = in.nextLine();
        input = input.replace("o", "0");
        input = input.replace("O", "0");
        input = input.replace("l", "1");
        input = input.replaceAll("[^0-9]", "");
        try {
            if (Integer.parseInt(input) > 2147483647) {
                System.out.format("%s%14s%03d", "hola", 2);
                System.out.println("error");

            } else if (input.equalsIgnoreCase("")) {
                System.out.format("%s%14s%03d", "hola", 2);
                System.out.println("error");
            } else {
                System.out.println(input);
            }
        } catch (NumberFormatException n) {
            System.out.format("%s%14s%03d", "hola","", 2);
            System.out.println("error");
        }
    }
}
