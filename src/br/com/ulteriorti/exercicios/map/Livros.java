package br.com.ulteriorti.exercicios.map;

import java.util.*;

public class Livros {
    public static void main(String[] args) {
        System.out.println("Ordem aleatoria");
        Map<String, Livro> livros = new HashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhing, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};

        for (Map.Entry<String, Livro> livro : livros.entrySet()) {
            System.out.println(livro.getKey() + " -" + livro.getValue().getNome());
        }

        //ordem de insercao
        Map<String, Livro> livros2 = new LinkedHashMap<>() {{
            put("Hawking, Stephen", new Livro("Uma breve história do tempo", 256));
            put("Duhing, Charles", new Livro("O poder do hábito", 408));
            put("Harari, Yuval Noah", new Livro("21 Lições para o século 21", 432));
        }};
        System.out.println("");
        System.out.println("Por inserção");
        for (Map.Entry<String, Livro> livro : livros2.entrySet()) {
            System.out.println(livro.getKey() + " -" + livro.getValue().getNome());
        }
        System.out.println(" ");
        System.out.println("Por nome do autor");
        Map<String, Livro> livros3 = new TreeMap<>(livros);
        for (Map.Entry<String, Livro> livro : livros3.entrySet()) {
            System.out.println(livro.getKey() + " -" + livro.getValue().getNome());
        }
        System.out.println(" ");
        System.out.println("Por nome do livro");
        Set<Map.Entry<String, Livro>> livros4 = new TreeSet<>(new ComparatorNome());
        livros4.addAll(livros3.entrySet());
        for (Map.Entry<String, Livro> livro : livros4) {
            System.out.println(livro.getKey() + " -" + livro.getValue().getNome());
        }


    }

}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareTo(l2.getValue().getNome());
    }
}

class Livro {
    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Livro)) return false;

        Livro livro = (Livro) o;

        if (!nome.equals(livro.nome)) return false;
        return paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + paginas.hashCode();
        return result;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}
