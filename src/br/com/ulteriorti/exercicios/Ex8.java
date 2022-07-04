package br.com.ulteriorti.exercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    public static void run() {
        Scanner scan = new Scanner(System.in);
        boolean continuar = true;
        boolean vogal = false;
        char resp = 'S';
        char t;

        List<Character> letras = new ArrayList<Character>();

        do {
            vogal=false;

            System.out.println("Digite uma letra: ");
            t = (scan.next().charAt(0));

            for (vogais v : vogais.values()) {
                if (v.name().equals(String.valueOf(t))) {
                    vogal = true;
                }
            }
            if (!vogal) {
                letras.add(t);
            }

            System.out.println("Continuar? S/N :");
            resp = scan.next().charAt(0);
            if (resp == 'n' || resp == 'N')
                continuar = false;

        } while (continuar);

        System.out.println(Arrays.toString(letras.toArray()));
    }

    public static enum vogais {
        A,
        E,
        I,
        O,
        U,
        a,
        e,
        i,
        o,
        u
    }
}
