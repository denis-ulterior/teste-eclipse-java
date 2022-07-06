package br.com.ulteriorti.exercicios.collections;

import java.util.*;

public class LiguagensFavoritas {
    public static void main(String[] args) {
        List<Linguagens> linguagens = new LinkedList<>();
        linguagens.add(new Linguagens("Java",1994,"InteliJ"));
        linguagens.add(new Linguagens("Typescript",2015,"VisualStudioCode"));
        linguagens.add(new Linguagens("C",1960,"Codeblocks"));
        linguagens.add(new Linguagens("Python",1999,"InleliJ"));

        System.out.println(linguagens);
        Set<Linguagens> linguagensPorNome = new TreeSet<>(linguagens);
        System.out.println(linguagensPorNome);
        Set<Linguagens> linguagensIde = new TreeSet<>(new odenarPorIde());
        linguagensIde.addAll(linguagens);
        System.out.println(linguagensIde);
        Set<Linguagens> linguagensAnoNome = new TreeSet<>(new odenarPorAnoNome());
        linguagensAnoNome.addAll(linguagens);
        System.out.println(linguagensAnoNome);
    }
}

class odenarPorIde implements Comparator<Linguagens> {

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        return o1.ide.compareTo(o2.ide);
    }
}

class odenarPorAnoNome implements Comparator<Linguagens> {

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        if (o1.ano.compareTo(o2.ano) == 0) {
            return o1.nome.compareTo(o2.nome);
        } else
            return o1.ano.compareTo(o2.ano);
    }
}

class odenarPorNomeAnoIde implements Comparator<Linguagens> {

    @Override
    public int compare(Linguagens o1, Linguagens o2) {
        if (o1.nome.compareTo(o2.nome) == 0) {
            if (o1.ano.compareTo(o2.ano) == 0) {
                return o1.ide.compareTo(o2.ide);
            } else {
                return o1.ano.compareTo(o2.ano);
            }
        } else {
            return o1.nome.compareTo(o2.nome);
        }
    }
}

class Linguagens implements Comparable<Linguagens>{
    @Override
    public String toString() {
        return "Linguagens{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", ide='" + ide + '\'' +
                '}';
    }

    String nome;
    Integer ano;
    String ide;

    public Linguagens(String nome, Integer ano, String ide) {
        this.nome = nome;
        this.ano = ano;
        this.ide = ide;

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Linguagens)) return false;

        Linguagens that = (Linguagens) o;

        if (nome != null ? !nome.equals(that.nome) : that.nome != null) return false;
        if (ano != null ? !ano.equals(that.ano) : that.ano != null) return false;
        return ide != null ? ide.equals(that.ide) : that.ide == null;
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + (ano != null ? ano.hashCode() : 0);
        result = 31 * result + (ide != null ? ide.hashCode() : 0);
        return result;
    }
    @Override
    public int compareTo(Linguagens o) {
        return this.nome.compareTo(o.nome);
    }
}
