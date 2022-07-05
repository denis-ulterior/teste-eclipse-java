package br.com.ulteriorti.exercicios.basico;

import java.util.Random;

public abstract class Ex10 {
    static int[][] matriz = new int[4][4];

    public static void run() {
        Random random = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(9);
            }
        }
        for (int[] linha : matriz) {
            for (int v : linha) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }
}
