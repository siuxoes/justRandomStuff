package SelfDescriptive;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static boolean isSelfDescribing(int a){
        String s = Integer.toString(a);
        for(int i = 0; i < s.length(); i++){
            String s0 = s.charAt(i) + "";
            int b = Integer.parseInt(s0); // number of times i-th digit must occur for it to be a self describing number
            int count = 0;
            for(int j = 0; j < s.length(); j++){
                int temp = Integer.parseInt(s.charAt(j) + "");
                if(temp == i){
                    count++;
                }
                if (count > b) return false;
            }
            if(count != b) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                if(isSelfDescribing(Integer.parseInt(line))){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
        }
    }
}
