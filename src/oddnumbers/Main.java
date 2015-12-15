package oddnumbers;

/**
 * Created by siuxoes on 12/12/2015.
 */
public class Main {

    public void oddNumber(){
       for(int n=1; n<100; n++){
           if ( (n & 1) != 0 )
           {
               System.out.println(n);
           }
       }

    }
    public static void main(String[] args) {
        Main m = new Main();
        m.oddNumber();
    }
}
