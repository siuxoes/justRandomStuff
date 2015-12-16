package JavaExceptionHandling;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Solution {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            int n = Integer.parseInt(in.nextLine());
            int m = Integer.parseInt(in.nextLine());
            System.out.println(n / m);
        }catch(java.util.InputMismatchException c){
            System.out.println("java.util.InputMismatchException");
        }catch (java.lang.ArithmeticException a){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }catch(NumberFormatException a){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
