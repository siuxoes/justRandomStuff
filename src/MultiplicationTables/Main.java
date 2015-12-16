package MultiplicationTables;

/**
 * Created by siuxoes on 12/16/2015.
 */
public class Main {

    public static void main(String[] args) {
        int max = 12;
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                if (j == 1) {
                    System.out.print(j*i);
                } else {
                    System.out.print(" " + j*i);
                }
            }
            System.out.println();
        }
    }
}
