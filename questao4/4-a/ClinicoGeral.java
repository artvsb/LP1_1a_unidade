public class ClinicoGeral extends Medico {

    public ClinicoGeral(String nome, int crm) {
        super(nome, crm);
    }

    public void diagnosticar() {
        System.out.println("O clínico geral está realizando o diagnóstico inicial do paciente.");
    }
}
