package Prac;

/**
 * Created by siuxoes on 12/21/2015.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class myRegex{
    static String pattern =
            "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
}
public class Main {

    public static Scanner in = new Scanner(System.in);
    public static void main(String []args)
    {
       /* String html = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while<par>";
        String regex = "[<.*?[a-zA-Z]*>.]";
        String replacement = "";
        System.out.println(html.replaceAll(regex, replacement));*/
        while(in.hasNext()){
            System.out.println(in.nextInt());
            System.out.println(in.nextDouble());
        }

    }
}
