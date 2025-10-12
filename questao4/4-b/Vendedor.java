public class Vendedor {
    String nome;
    int matricula;

    public Vendedor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibirDados() {
        System.out.println("Nome do vendedor: " + nome);
        System.out.println("Matrícula: " + matricula);
    }
}
