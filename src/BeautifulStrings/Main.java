package BeautifulStrings;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() == 0){
                continue;
            }
            String s = line;
            s = s.toLowerCase();
            s = s.replaceAll("[^a-z]", "");
            int sum = 0;
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for(char c: s.toCharArray()){
                if (map.containsKey(c)) {
                    int value = map.get(c);
                    map.put(c, value+1);
                } else {
                    map.put(c, 1);
                }
            }
            final HashMap<Character, Integer> map2 = new HashMap<>();
            map2.putAll(map);
            Map<Character, Integer> treeMap = new TreeMap<>(new Comparator<Character>() {
                @Override
                public int compare(Character o1, Character o2) {
                    if (map2.get(o1) >= map2.get(o2)) {
                        return -1;
                    } else {
                        return 1;
                    }
                }
            });
            treeMap.putAll(map2);
            int max = 26;
            for (Map.Entry<Character, Integer> entry : treeMap.entrySet()) {
                sum += entry.getValue() * max;
                max--;
            }
            System.out.println(sum);
        }
    }
}
