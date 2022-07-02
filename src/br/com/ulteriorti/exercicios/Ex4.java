package br.com.ulteriorti.exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void run() {
        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();

        while (true) {
            int tmp;
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um numero: ");
            tmp = Integer.parseInt(scan.next());

            if(tmp == 0)
                break;
            else if (tmp % 2 == 0)
                pares.add(tmp);
            else
                impares.add(tmp);

            System.out.println("Impares: "+impares);
            System.out.println("Pares: "+pares);
        }
        System.out.println("Pares: "+pares.size());
        System.out.println("Impares: "+impares.size());
    }
}
