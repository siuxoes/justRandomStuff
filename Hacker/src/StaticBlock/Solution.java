package StaticBlock;

/**
 * Created by siuxoes on 12/16/2015.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    private static Scanner in = new Scanner(System.in);
    public static int B, H;
    static{
        try{
           B = Integer.parseInt(in.nextLine());
            H = Integer.parseInt(in.nextLine());
            if(B<0 || H <0){
                throw new Exception();
            }
        }catch(Exception e)
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

    }
}
