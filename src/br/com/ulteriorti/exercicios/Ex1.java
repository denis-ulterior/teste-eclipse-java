package br.com.ulteriorti.exercicios;

import java.util.Scanner;

import static br.com.ulteriorti.exercicios.StringOperators.paraString;

public class Ex1 {
    public static void run() {
        String nome;
        String idade;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Digite o nome");
            nome = scan.next();
            if (nome.equals("0"))
                break;
            System.out.println("Digite a idade");
            idade = scan.next();

            System.out.println(paraString(nome, idade));
        }
        System.exit(0);
    }
}
