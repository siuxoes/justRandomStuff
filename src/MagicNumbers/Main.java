package MagicNumbers;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    public static boolean isMagic(int n) {
        int sum = 0, num = n;
        while (num > 9) {
            sum = num;
            int s = 0;
            while (sum != 0) {
                s = s + (sum % 10);
                sum = sum / 10;
            }
            num = s;
        }
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        String texto = "";
        for(int i=10; i<=100;i++){
            if(isMagic(i)){
                texto += i + " ";
            }
        }
        System.out.println(texto);
    }
}
