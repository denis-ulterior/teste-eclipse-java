package br.com.ulteriorti;

import br.com.ulteriorti.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {
        /*int a = 5;
        int b = 3;

        System.out.println("Hello" + (a+b));*/
        Gato gato = new Gato("Tuca", "branco", 8);

        System.out.println(gato);
    }
}
