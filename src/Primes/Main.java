package Primes;

/**
 * Created by siuxoes on 12/12/2015.
 */
public class Main {

    private static boolean isPrime(int n) {
        int root = (int) Math.sqrt(n);
        for (int i = 2; i <= root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int sumOfPrimes() {
        int sum = 0;
        int cont = 0;
        for (int i = 1; cont <= 1000; i++) {
            if (isPrime(i)) {
                sum += i;
                cont++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println(m.sumOfPrimes() - 1);
    }
}
