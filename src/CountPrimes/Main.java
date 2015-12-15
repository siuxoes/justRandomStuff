package CountPrimes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/13/2015.
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

    public static int count(int min, int max) {
        int con = 0;
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                con++;
            }
        }
        return con;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.length() != 0) {
                String[] s = line.split(",");
                System.out.println(count(Integer.parseInt(s[0]), Integer.parseInt(s[1])));
            }
        }
    }

}
