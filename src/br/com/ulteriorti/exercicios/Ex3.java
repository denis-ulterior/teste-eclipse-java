package br.com.ulteriorti.exercicios;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex3 {
    public static void run() {
        Integer[] numeros = new Integer[5];
        int maior = 0;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(StringOperators.paraString("Digite o numero", i + 1));
            numeros[i] = Integer.parseInt(scan.next());
            maior = numeros[i] > maior ? numeros[i] : maior;
        }
        System.out.println(StringOperators.paraString("Maior: ", maior));
        System.out.println("Soma: " + somar(numeros));
        System.out.println("Media: " + media(numeros));
    }
    private static int somar(Integer[] a) {
        int res = 0;
        for (Integer integer : a) {
            res += integer;
        }
        return res;
    }
    private static double media(Integer[] a) {

        return somar(a) / a.length;
    }
}
