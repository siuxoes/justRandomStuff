package AgeDistribution;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/15/2015.
 */
public class Main {
    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public static String mostrar(int age){
        if(isBetween(age, 0, 2))
            return "Still in Mama's arms";
        else if(isBetween(age, 3, 4))
            return "Preschool Maniac";
        else if (isBetween(age, 5, 11))
            return "Elementary school";
        else if(isBetween(age, 12, 14))
            return "Middle school";
        else if(isBetween(age, 15, 18))
            return "High school";
        else if(isBetween(age, 19, 22))
            return "College";
        else if(isBetween(age, 23, 65))
            return "Working for the man";
        else if(isBetween(age, 66, 100))
            return "The Golden Years";
        else
            return "This program is for humans";
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            System.out.println(mostrar(Integer.parseInt(line)));
        }
    }
}
