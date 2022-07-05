package br.com.ulteriorti.exercicios.basico;

import java.util.Scanner;

public class Ex2 {
    public static void run(){
        Scanner scan = new Scanner(System.in);
        int nota  = -1;
        boolean valido;

        while (!(nota >=0 && nota <=10)){
            System.out.println("Digite a nota: ");
            nota  = Integer.parseInt(scan.next());
            valido =  nota < 0 && nota > 10;
            if(!valido)
                System.out.println("Invalido!");
        }

    }

    private static void mensagem(String msg) {
        System.out.println(msg);
    }
}
