package RightmostChar;

import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException {
        File file = new File("C:\\1.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            if(line.length() != 0){
                String[] arr = line.split(",");
                String reversed = new StringBuilder(arr[0]).reverse().toString();
                int n = reversed.indexOf(arr[1]);
                if(n==-1){
                    System.out.println("-1");
                }else{
                    System.out.println(arr[0].length()-(n+1));
                }
            }
        }
    }
}
