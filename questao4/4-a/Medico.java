public class Medico {
    protected String nome;
    protected int crm;

    public Medico(String nome, int crm) {
        this.nome = nome;
        this.crm = crm;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("CRM: " + crm);
    }
}
