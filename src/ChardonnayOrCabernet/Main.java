package ChardonnayOrCabernet;

/**
 * Created by siuxoes on 12/22/2015.
 */
public class Main {

    public static boolean tieneTodo(String vino, String letras) {
        for (char c : letras.toCharArray()) {
            if (letras.length() == 0 || vino.length() == 0) {
                return false;
            }
            if (vino.indexOf(c) != -1) {
                letras = borrarChar(letras, c);
                vino = borrarChar(vino, c);
                tieneTodo(vino, letras);
            } else {
                return false;
            }
        }
        return true;
    }

    public static String borrarChar(String s, char c){
        int indice = s.indexOf(c);
        s = s.substring(0, indice) + s.substring(indice);
        return s;
    }

    public static void main(String[] args) {

        String input = "x xaxx xaxax | xxxaa";
        String[] arr = input.split(" \\| ");
        String resultado = "False";
        boolean primera = true;
        for (String s : arr[0].split(" ")) {
            if (tieneTodo(s, arr[1])) {
                if (primera) {
                    resultado = "";
                }
                resultado += s + " ";
                primera = false;
            }
        }
        System.out.println(resultado);
    }
}
