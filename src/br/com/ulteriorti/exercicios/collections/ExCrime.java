package br.com.ulteriorti.exercicios.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExCrime {
    public static void main(String[] args) {
        int sim =0;
        List<String> respostas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ligou para a vitima?");
        respostas.add(scan.next());

        System.out.println("Esteve no local do crime?");
        respostas.add(scan.next());

        System.out.println("Mora perto da vitima?");
        respostas.add(scan.next());

        System.out.println("Devia para a vítima? ");
        respostas.add(scan.next());

        System.out.println("Já trabalhou para a vítima");
        respostas.add(scan.next());

        for (String s:respostas ) {
            s = s.toLowerCase();
            if (s.equals("sim"))
                sim++;
        }
        switch (sim){
            case 2:
                System.out.println("Suspeito");
                break;
            case 3,4:
                System.out.println("Cumplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
            }
        }
    }

