package CreditCardValidation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {


    public static boolean Check(String ccNumber)
    {
        ccNumber = ccNumber.replace(" ", "");
        int sum = 0;
        boolean alternate = false;
        for (int i = ccNumber.length() - 1; i >= 0; i--)
        {
            int n = Integer.parseInt(ccNumber.substring(i, i + 1));
            if (alternate)
            {
                n *= 2;
                if (n > 9)
                {
                    n = (n % 10) + 1;
                }
            }
            sum += n;
            alternate = !alternate;
        }
        return (sum % 10 == 0);
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                if(Check(line)){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }
    }
}
