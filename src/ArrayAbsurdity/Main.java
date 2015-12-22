package ArrayAbsurdity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    public static String duplicates(final String[] list)
    {
        Set<String> lump = new HashSet<>();
        for (String i : list)
        {
            if (lump.contains(i)) return i;
            lump.add(i);
        }
        return "nope";
    }
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                String[] arr1 = line.split(";");
                String[] arr2 = arr1[1].split(",");
                System.out.println(duplicates(arr2));
            }
        }

    }
}
