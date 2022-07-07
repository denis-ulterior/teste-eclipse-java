package br.com.ulteriorti.exercicios.map;

import java.util.*;
import java.util.stream.Collectors;

public class MetodoMap {
    public static void main(String[] args) {
        System.out.println("Modelos de carro e consumos");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);

        }};
//veiculos inseridos
        System.out.println(carrosPopulares);

        System.out.println("Troca o consumo do gol por 15.2");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

        System.out.println("Tucson esta na lista? " + carrosPopulares.containsKey("Tucson"));

        System.out.println("Consumo do uno: " + carrosPopulares.get("uno"));

        System.out.println("Modelos em ordem de inserção");
        Map<String, Double> carrosPopulares2 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares2);

        System.out.println("Somente os modelos: " + carrosPopulares.keySet());

        System.out.println("Somente os consumos" + carrosPopulares.values());

        System.out.println("O carro mais eficiente:");
        Double melhorConsumo = (Collections.max(carrosPopulares.values()));
        for (Map.Entry<String, Double> stringDoubleEntry : carrosPopulares.entrySet()) {
            if (stringDoubleEntry.getValue() == melhorConsumo) {
                System.out.println(stringDoubleEntry.getKey() + " - " + stringDoubleEntry.getValue());
            }
        }

        System.out.println("O carro menos eficiente:");
        Double piorConsumo = (Collections.min(carrosPopulares.values()));
        for (Map.Entry<String, Double> stringDoubleEntry : carrosPopulares.entrySet()) {
            if (stringDoubleEntry.getValue() == piorConsumo) {
                System.out.println(stringDoubleEntry.getKey() + " - " + stringDoubleEntry.getValue());
            }
        }

        System.out.println("Consumo de todos juntos");
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println(soma);

        iterator = carrosPopulares.values().iterator();
        System.out.println("Removendo todos com 15.6");
        while (iterator.hasNext()){
            if(iterator.next().equals(15.6))
                iterator.remove();
        }
        System.out.println(carrosPopulares);

        //ordenado pela inserção
        Map<String,Double> carrosPopulares3 = new TreeMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares3);

        //ordenado pelo modelo
        Map<String,Double> carrosPopulares4 = new TreeMap<>();

        for (Map.Entry<String, Double> stringDoubleEntry : carrosPopulares2.entrySet()) {
            carrosPopulares4.put(stringDoubleEntry.getKey(),stringDoubleEntry.getValue());
        }

        carrosPopulares3.clear();
        carrosPopulares.clear();
        carrosPopulares4.clear();
        carrosPopulares2.clear();

        System.out.println(carrosPopulares.toString() + carrosPopulares2 + carrosPopulares3 + carrosPopulares4);





    }
}
