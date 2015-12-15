import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by siuxoes on 12/12/2015.
 */
public class Main {

    private ArrayList<String> listaP;
    private ArrayList<String> listaS;

    public void llenarListas() {
        char letra;
        listaP = new ArrayList<>();
        for (letra = 'a'; letra <= 'm'; letra++) {
            listaP.add(Character.toString(letra));
        }
        listaS = new ArrayList<>();
        for (letra = 'u'; letra <= 'z'; letra++) {
            listaS.add(Character.toString(letra));
        }
        for (letra = 'n'; letra <= 't'; letra++) {
            listaS.add(Character.toString(letra));
        }
    }

    public static void main(String[] args) throws IOException {
        Main it = new Main();
        it.llenarListas();
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            if (line.length() != 0) {
                System.out.println(it.resolver(line));
            }
        }
    }

    public String resolver(String res) {
        String resultado = "";
        for (int i = 0; i < res.length(); i++) {
            int index = listaP.indexOf("" + res.charAt(i));
            if(index != -1){
                resultado += listaS.get(index);
            }else{
                index = listaS.indexOf("" + res.charAt(i));
                resultado += listaP.get(index);
            }
        }
        return resultado;
    }

}
