package MultiplesOfNumber;

import java.io.*;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static int devolverNumeroMayor(int n, int m) {
        boolean mayor = false;
        int result = 0;
        for (int i = 0; !mayor; i++) {
            if (m * i >= n) {
                result = m * i;
                mayor = true;
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                String[] ar = line.split(",");
                System.out.println(devolverNumeroMayor(Integer.parseInt(ar[0]), Integer.parseInt(ar[1])));
            }
        }
    }
}
