public class Cliente {
    String nome;
    String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void exibirDados() {
        System.out.println("Nome do cliente: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
