package Flavius;

import java.util.Arrays;

/**
 * Created by siuxoes on 12/13/2015.
 */
public class Main {

    private static boolean[] arrayI;

    public static void llenar(int n){
        arrayI = new boolean[n];
        Arrays.fill(arrayI, Boolean.FALSE);
    }

    public static boolean areAllTrue(boolean[] array)
    {
        for(boolean b : array) if(!b) return false;
        return true;
    }

    public static int nextIndex(int current, int step){
        for(int i=current; i<arrayI.length; i+=step){
            if(arrayI[i] == false){
                return i;
            }
        }
        return 0;
    }

    public static int numberOf(){
        int cont = 0;
        for(boolean b: arrayI){
            if(b == false){
                cont++;
            }
        }
        return cont;
    }
    public static void matar(int orden){
        String texto = "";
        int indice = orden - 1;
        while(!areAllTrue(arrayI)){
            if(arrayI[indice] == false){
                arrayI[indice] = true;
                texto += ""+indice + " ";
            }
            int cont = 0;
            if(numberOf() != 2) {
                while (cont < 2) {
                    if (arrayI[indice] != false) {
                        cont++;
                    }
                    indice++;
                    if (indice == arrayI.length) {
                        indice = 0;
                    }
                }
            }
            if(indice >= arrayI.length){
                indice -= arrayI.length;
            }
        }
        System.out.println(texto);
    }
    public static void main(String[] args) {
        llenar(5);
        matar(2);
    }

}
