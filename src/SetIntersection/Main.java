package SetIntersection;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by siuxoes on 12/19/2015.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            List<String> origList = new ArrayList(Arrays.asList(line.split(";")[0].split(",")));
            List<String> actList = new ArrayList(Arrays.asList(line.split(";")[1].split(",")));
            origList.retainAll(actList);
            String resul = "";
            for(String t:origList){
                resul += t+",";
            }
            if(!resul.equalsIgnoreCase("")){
                System.out.println(resul.substring(0, resul.length()-1));
            }
        }

    }
}
