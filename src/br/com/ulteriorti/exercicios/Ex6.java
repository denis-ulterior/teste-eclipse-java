package br.com.ulteriorti.exercicios;

public class Ex6 {
    /**
     * Calcula e retorna o fatorial de um numero
     * imprime o processo
     *
     * @param n Numero a ser calcular
     * @return inteiro retornado do cálculo
     */
    public static int fatorial(int n) {
        StringBuilder string = new StringBuilder();
        string.append(n);

        int i = n - 1;
        int res = n;
        while (i > 0) {
            res = res * i;
            string.append("*");
            string.append(i);
            i--;
        }
        string.append("=").append(res);
        System.out.println(string);
        return res;
    }
}
