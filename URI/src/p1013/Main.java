package p1013;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);


    public static void main(String[] args) {
        String n = in.nextLine();
        String[] s = n.split(" ");
        int a, b,c;
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
        c = Integer.parseInt(s[2]);
        int mayor=(a+b+Math.abs(a-b))/2;
        int mayorTodos=(mayor+c+Math.abs(mayor-c))/2;
        System.out.format("%d eh o maior\n", mayorTodos);
    }
}
