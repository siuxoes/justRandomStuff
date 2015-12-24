package PrimePalindrome;

/**
 * Created by siuxoes on 12/23/2015.
 */
public class Main {

    public static boolean isPalindrome(String s) {
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }

    public static boolean isPrime(int n) {
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        for (int i = 1000; i > 3; i--) {
            if (isPalindrome(String.valueOf(i)) && isPrime(i)) {
                System.out.println(i);
                break;
            }
        }
    }
}
