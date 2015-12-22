package AromaticNumbers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    public static void mensaje(String an){
        an=an.toUpperCase();
        String v[] = new String[an.length() / 2];
        int counter=0;
        for(int i=0;i<an.length();i+=2)
        {
            v[counter]=an.charAt(i)+""+an.charAt(i+1);
            counter++;
        }
        int sum=0;
        char b;
        int a;
        int va=1;
        int p;
        for(int i=0;i<v.length;i++)
        {
            b=v[i].charAt(1);
            switch(b)
            {
                case 'I':va=1;
                    break;
                case 'V':va=5;
                    break;
                case 'X':va=10;
                    break;
                case 'L':va=50;
                    break;
                case 'C':va=100;
                    break;
                case 'D':va=500;
                    break;
                case 'M':va=1000;
                    break;
            }
            a = Integer.parseInt(v[i].charAt(0) + "");
            if (a > va)
                a=a*(-1);
            p=a*va;
            sum=sum+p;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                mensaje(line);
            }
        }
    }
}
