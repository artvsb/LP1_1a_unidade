public class Cirurgiao extends Medico {
    private String especialidadeCirurgia;

    public Cirurgiao(String nome, int crm, String especialidadeCirurgia) {
        super(nome, crm);
        this.especialidadeCirurgia = especialidadeCirurgia;
    }

    // sobrescreve sem usar @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Especialidade Cirúrgica: " + especialidadeCirurgia);
    }

    public void realizarCirurgia() {
        System.out.println("O cirurgião está realizando uma cirurgia de " + especialidadeCirurgia + ".");
    }
}
