package ReadMore;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {
    public static void main(String[] args) {
        String s = "Two thousand verses is a great many - very, very great many.";
        if(s.length()>55){
            s = s.substring(0, 40);
            s = s.trim();
            System.out.println(s);
        }
    }
}
