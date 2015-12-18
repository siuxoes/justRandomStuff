package TimeToEat;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

/**
 * Created by siuxoes on 12/18/2015.
 */
public class Main {

    public static String devolverFechaFormto(Date s){
        String t = String.format("%02d:%02d:%02d", s.getHours(),s.getMinutes(), s.getSeconds());
        return t;
    }

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] ar = line.split(" ");
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            ArrayList<Date> newArray = new ArrayList<>();
            for (String s : ar) {
                try {
                    Date date1 = format.parse(s);
                    newArray.add(date1);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }
            Collections.sort(newArray);
            String texto = "";
            for(int i=newArray.size()-1; i>=0; i--){
                texto += devolverFechaFormto(newArray.get(i)) + " ";
            }
            System.out.println(texto.substring(0, texto.length()-1));
        }
    }
}
