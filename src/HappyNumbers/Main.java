package HappyNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by siuxoes on 12/15/2015.
 */
public class Main {


    public static boolean isNumberHappy(int n)
    {
        Set<Integer> visited = new HashSet<Integer>();

        while (!visited.contains(n)) {
            visited.add(n);
            n = sumOfDigitSquares(n);

            if (n == 1) {
                return true;
            }
        }

        return false;
    }

    public static int sumOfDigitSquares(int n)
    {
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += lastDigit*lastDigit;
            n /= 10;
        }

        return sum;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int n = Integer.parseInt(line);
            if((isNumberHappy(n))){
                System.out.println(1);
            }else{
                System.out.println(0);
            }
        }
    }
}
