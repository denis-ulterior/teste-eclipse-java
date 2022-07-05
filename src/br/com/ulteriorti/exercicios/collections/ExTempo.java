package br.com.ulteriorti.exercicios.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


class Clima {
    Double temperatura = 0.0;
    int mes = 0;


    public boolean equals(Clima o) {
        if (this.mes == o.mes) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(temperatura, mes);
    }

    @Override
    public String toString() {
        return "Clima{" +
                "temperatura=" + temperatura +
                ", mes=" + mes +
                '}';
    }
}

public class ExTempo {
    public static void main(String[] args) {
        List<Clima> historico = new ArrayList<>();
        addMesesSemestre(historico, 1);
        Double mediaSemestre1 = calcularMediaSemestral(historico, 1);
        System.out.println("Media primeiro semestre: " + mediaSemestre1);
        acimaDaMedia(historico, mediaSemestre1);

    }

    private static void acimaDaMedia(List<Clima> historico, double media) {
        for (Clima c : historico) {
            if (c.temperatura > media) {
                System.out.println("Mes "+ mesPorExtenso(c.mes) + " acima da media "+ c.temperatura);
            }
        }
    }

    private static List<Clima> addMesesSemestre(List<Clima> historico, int semestre) {
        int mesInicial;
        if (semestre == 1)
            mesInicial = 1;
        else
            mesInicial = 7;
        Scanner scan = new Scanner(System.in);
        int tmpMes;
        double tmpTemperatura;
        for (int i = mesInicial; i < (mesInicial + 6); i++) {
            Clima clima = new Clima();
            System.out.println("Digite a temperatura do mes" + i);
            tmpMes = i;
            tmpTemperatura = Double.parseDouble(scan.next());
            clima.temperatura = tmpTemperatura;
            clima.mes = tmpMes;
            historico.add(clima);
        }
        return historico;
    }

    private static Double calcularMediaSemestral(List<Clima> historico, int semestre) {

        int inicio;
        int fim;
        double acumulador = 0.0;
        if (semestre == 1)
            inicio = 0;
        else if (semestre == 2 && historico.size() > 6)
            inicio = 6;
        else
            inicio = 0;
        fim = inicio + 6;
        for (int i = inicio; i < fim; i++) {
            acumulador += historico.get(i).temperatura;
        }

        return acumulador / 6;
    }

    private static String mesPorExtenso(int mes){
        switch (mes){
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Invalido";
        }
    }

}