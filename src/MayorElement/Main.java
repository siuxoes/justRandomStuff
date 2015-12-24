package MayorElement;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * Created by siuxoes on 12/13/2015.
 */
public class Main {

    private static Set<String> mySet;
    private static Map<String, Integer> dic;

    public static int input(String s) {
        String[] someArray = s.split(",");
        mySet = new HashSet<>(Arrays.asList(someArray));
        dic = new HashMap<>();
        for (String t : mySet) {
            dic.put(t, 0);
        }
        for (String tt : someArray) {
            dic.put(tt, dic.get(tt) + 1);
        }
        return someArray.length;
    }

    public static void main(String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                int longitud = input(line);
                boolean cond = false;
                for(Map.Entry<String, Integer> entry: dic.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();
                    if(value > (int)(longitud / 2)){
                        System.out.println(key);
                        cond = true;
                        break;
                    }
                }
                if(cond == false){
                    System.out.println("None");
                }
            }
        }
    }
}
