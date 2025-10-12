public class Titulo {
    String nome, genero;
    int duracao, ano, qtdAvaliacoes;
    double nota, somaNotas, media;

    public Titulo() {}

    public void exibirDetalhes() {
        if ((nome != null) && (genero != null) && (ano != 0) && (duracao != 0)) {
            System.out.println("-- DETALHES --");
            System.out.println("Nome: " + nome);
            System.out.println("Gênero: " + genero);
            System.out.println("Ano de lançamento: " + ano);
            System.out.println("Duração em minutos: " + duracao);

        } else {
            System.out.println("-- DETALHES --");
            System.out.println("Nome: A Lagoa Azul");
            System.out.println("Gênero: Romance");
            System.out.println("Ano de lançamento: 1980");
            System.out.println("Duração em minutos: 104");

        }

    }

    public void avaliar(double nota) {
        somaNotas += nota;
        qtdAvaliacoes++;
    }

    public double calcularMediaAvaliacoes() {
        if (qtdAvaliacoes == 0) {
            return 0.0;
        }
        return somaNotas / qtdAvaliacoes;
    }
}
