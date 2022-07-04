package br.com.ulteriorti.exercicios;

import java.util.Arrays;
import java.util.Collections;

public abstract class Ex7arrays {
    private static Integer[] array = null;

    /**
     * Inicializa por padrao com 6 numeros
     */
    public static void inicializa() {
        array = new Integer[6];
    }

    /**
     * Inicializa com um parametro
     *
     * @param n numero de itens desejados
     */
    public static void inicializa(int n) {
        array = new Integer[n];
    }

    public static void preencherArray() {
        if(array != null) {
            for (int i = 0; i < array.length; i++) {
                array[i] = i + 1;
            }
        }
    }

    public static void reverterArray() {
        if(array != null) {
            Collections.reverse(Arrays.asList(array));
        }
    }

    public static void imprimirArray() {
        if(array != null) {
            StringBuilder string = new StringBuilder();
            string.append("[");
            for (int i = 0; i < array.length; i++) {
                if (!(i == 0))
                    string.append(",");
                string.append(array[i]);
            }
            string.append("]");
            System.out.println(string);
        }
    }
}
