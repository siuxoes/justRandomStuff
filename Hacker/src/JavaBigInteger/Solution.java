package JavaBigInteger;

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
        BigInteger b1 = new BigInteger(in.nextLine());
        BigInteger b2 = new BigInteger(in.nextLine());
        System.out.println(b1.add(b2).toString());
        System.out.println(b1.multiply(b2).toString());
    }
}
