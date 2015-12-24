package CalculoMental;

import java.util.Scanner;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int veces = Integer.parseInt(in.nextLine());
        try {
            for (int i = 0; i < veces; i++) {
                String s = in.nextLine();
                s = s.replace(".", "");
                String[] arr = s.split(" ");
                String texto = "";
                int actual = -1;
                int segundo;
                int suma;
                String operacion = "";
                for (String t : arr) {
                    if (Character.isDigit(t.charAt(0))) {
                        if (actual == -1) {
                            actual = Integer.parseInt(t);
                        } else {
                            segundo = Integer.parseInt(t);
                            if (operacion.equalsIgnoreCase("+")) {
                                suma = (actual + segundo);
                            } else {
                                suma = (actual - segundo);
                            }
                            texto += suma + ", ";
                            actual = suma;
                        }
                    } else {
                        if (t.equalsIgnoreCase("+")) {
                            operacion = "+";
                        } else {
                            operacion = "-";
                        }
                    }
                }
                texto = texto.trim();
                texto = texto.substring(0, texto.length() - 1);
                System.out.println(texto);
            }
        }catch (Exception e){}
    }
}
