package br.com.ulteriorti.exercicios.basico;

import java.util.Random;

public abstract class Ex9 {
    static Random random = new Random();
    public static void run(){
        int[] numeros= new int[20];

        for(int i = 0; i< numeros.length ; i++){
            numeros[i] = random.nextInt(100);
            numeros[i] = Math.round(numeros[i]*1);
        }
        for(int numero : numeros){
            System.out.println(numero);
        }
    }
}
