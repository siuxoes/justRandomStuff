package TimeDifferences;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by siuxoes on 12/17/2015.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String time1 = line.split(" ")[0];
            String time2 = line.split(" ")[1];
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            Date date1 = format.parse(time1);
            Date date2 = format.parse(time2);
            long diff = date2.getTime() - date1.getTime();
            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            if(diffSeconds < 0){
                diffSeconds *= -1;
            }
            if(diffMinutes < 0){
                diffMinutes *= -1;
            }
            if(diffHours < 0){
                diffHours *= -1;
            }
            System.out.printf("%02d:%02d:%02d\n", diffHours, diffMinutes, diffSeconds);
        }

    }
}
