package Flavius;

import java.util.*;

/**
 * Created by siuxoes on 12/14/2015.
 */
public class Main2 {

    private static List<Integer> dic;

    public static void llenar(int n) {
        dic = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            dic.add(i);
        }
    }

    public static void matar(int orden) {
        String texto = "";
        int indice = orden - 1;
        while (dic.size() > 0) {
            texto += dic.get(indice) + " ";
            dic.remove(indice);
            indice += orden;
            if(indice >= dic.size()){
                indice -= dic.size();
            }
        }
        System.out.println(texto);
    }

    public static void main(String[] args) {
        llenar(5);
        matar(2);
    }

}
