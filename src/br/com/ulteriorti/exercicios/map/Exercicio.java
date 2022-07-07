package br.com.ulteriorti.exercicios.map;

import java.util.*;
import java.util.stream.Collectors;

public class Exercicio {
    public static void main(String[] args) {
        Map<String, Integer> populacoes = new LinkedHashMap<>();
        populacoes.put("PE", 9616621);
        populacoes.put("AL", 3351543);
        populacoes.put("CE", 9187103);
        populacoes.put("RN", 3534265);

        System.out.println(populacoes);

        System.out.println("");
        System.out.println("Atualizando populacao RN");
        populacoes.put("RN", 3534165);
        System.out.println(populacoes);

        if (!populacoes.containsKey("PB")) {
            populacoes.put("PB", 4039277);
        }

        System.out.println("");
        System.out.println(populacoes);

        System.out.println("");
        System.out.println("Populacao PE");
        System.out.println(populacoes.get("PE"));

        System.out.println("");
        System.out.println("Estados em ordem alfabetica");
        Map<String, Integer> populacaoOrdenada = new TreeMap<>();
        for (Map.Entry<String, Integer> entrada : populacoes.entrySet()) {
            populacaoOrdenada.put(entrada.getKey(), entrada.getValue());
        }
        System.out.println(populacaoOrdenada);

        System.out.println("");
        System.out.println("Menor populacao");
        Integer menor = Collections.min(populacaoOrdenada.values());
        for (Map.Entry<String, Integer> stringIntegerEntry : populacaoOrdenada.entrySet()) {
            if(stringIntegerEntry.getValue().equals(menor)){
                System.out.println(stringIntegerEntry.getKey() + " - "+stringIntegerEntry.getValue());
            }
        }System.out.println("Maior populacao");
        Integer maior = Collections.max(populacaoOrdenada.values());
        for (Map.Entry<String, Integer> stringIntegerEntry : populacaoOrdenada.entrySet()) {
            if(stringIntegerEntry.getValue().equals(maior)){
                System.out.println(stringIntegerEntry.getKey() + " - "+stringIntegerEntry.getValue());
            }
        }
        System.out.println("");
        System.out.println("Soma da população dos estados");
        Integer soma=0;
        for(Map.Entry<String,Integer> entrada: populacoes.entrySet()){
            soma += entrada.getValue();
        }
        System.out.println(soma);

        System.out.println("Media: "+ soma / populacoes.size());

        Iterator iterator = populacoes.values().iterator();

        while (iterator.hasNext()){
            if(Integer.parseInt(iterator.next().toString()) < 4000000){
                iterator.remove();
            }
        }
        System.out.println(populacoes);



    }
}
