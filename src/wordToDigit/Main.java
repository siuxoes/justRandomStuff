package wordToDigit;

import java.io.BufferedReader;
        import java.io.File;
        import java.io.FileReader;
        import java.io.IOException;
        import java.util.HashMap;
        import java.util.Map;

/**
 * Created by siuxoes on 12/12/2015.
 */
public class Main {

    private Map<String, Integer> diccionario = new HashMap<>();

    public void cargardic(){
        diccionario.put("zero", 0);
        diccionario.put("one", 1);
        diccionario.put("two", 2);
        diccionario.put("three", 3);
        diccionario.put("four", 4);
        diccionario.put("five", 5);
        diccionario.put("six", 6);
        diccionario.put("seven", 7);
        diccionario.put("eight", 8);
        diccionario.put("nine", 9);
    }

    public String mapear(String n){
        String[] array = n.split(";");
        String resultado = "";
        for(String s: array){
            resultado+= diccionario.get(s);
        }
        return resultado;
    }

    public static void main(String[] args) throws IOException {
        Main m = new Main();
        m.cargardic();
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if(line.length() != 0){
                System.out.println(m.mapear(line));
            }
        }
    }
}
