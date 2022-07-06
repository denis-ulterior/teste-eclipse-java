package br.com.ulteriorti.exercicios.collections;

import java.util.*;
import java.util.stream.Collectors;

public class Cores {
    public static void main(String[] args) {

        //Inicializa o Set
        Set<String> cores = new LinkedHashSet<>();
        cores.add("Azul");
        cores.add("Violeta");
        cores.add("Vermelhor");
        cores.add("Amarelo");
        cores.add("Verde");
        cores.add("Branco");

        //imprime linha apos linha
        for (String c : cores) {
            System.out.println(c);
        }

        //Mostra a quantidad de cores
        System.out.println(cores.size());

        //converte para array para depois reordenar
        ArrayList<String> coresArray = new ArrayList<>(cores);
        Collections.sort(coresArray);
        System.out.println(coresArray);

        //volta ao estado original para ordenar em reverso do inserido
        coresArray = new ArrayList<String>(cores);
        Collections.reverse(coresArray);
        System.out.println(coresArray);

        //Filtra se inicia com V ou não
        //System.out.println(coresArray.stream().filter(entrada -> (entrada.charAt(0)=='V')).toList());
        List<String> filtrado = coresArray.stream().filter(entrada -> (entrada.charAt(0) == 'V')).toList();
        System.out.println(filtrado);
        coresArray = new ArrayList<String>(coresArray.stream().filter(entrada-> (entrada.charAt(0) != 'V')).collect(Collectors.toList()));
        System.out.println(coresArray);
    }
}
