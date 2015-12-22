package p1871;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/19/2015.
 */
public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String s = "";
        while(!(s = in.nextLine()).equalsIgnoreCase("0 0")){
            String[] arr = s.split(" ");
            int n1 = Integer.parseInt(arr[0]);
            int n2 = Integer.parseInt(arr[1]);
            String resultado = String.valueOf(n1+n2);
            resultado = resultado.replace("0", "");
            System.out.println(resultado);
        }
    }

}
