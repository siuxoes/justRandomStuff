package MordeCode;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by siuxoes on 12/19/2015.
 */
public class Main {

    public static String[] alpha = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v",
            "w", "x", "y", "z", "1", "2", "3", "4", "5", "6", "7", "8",
            "9", "0", " " };
    public static String[] dottie = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
            "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
            "-.--", "--..", ".----", "..---", "...--", "....-", ".....",
            "-....", "--...", "---..", "----.", "-----", "|" };

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        Map<String, String> dic = new HashMap<>();
        for(int i= 0; i < dottie.length; i++){
            dic.put(alpha[i], dottie[i]);
        }
        while ((line = buffer.readLine()) != null) {
            if(line.length() != 0){
                String[] arr = line.split("  ");
                String result = "";
                for(int i=0; i<arr.length; i++){
                    for(String s: arr[i].split(" ")){
                        for (Map.Entry<String, String> e : dic.entrySet()) {
                            if(e.getValue().equalsIgnoreCase(s)){
                                result+=e.getKey();
                            }
                        }

                    }
                    result += " ";
                }
                System.out.println(result.toUpperCase().substring(0, result.length()-1));
            }
        }

    }
}
