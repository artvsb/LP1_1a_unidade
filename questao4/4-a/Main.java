public class Main {
    public static void main(String[] args) {

        ClinicoGeral clinico = new ClinicoGeral("Dra. Juliana Mendes", 1234);
        Cirurgiao cirurgiao = new Cirurgiao("Dr. Nepomuceno Formiga", 5678, "Cardíaca");

        System.out.println("-- CLÍNICO GERAL --");
        clinico.exibirDados();
        clinico.diagnosticar();

        System.out.println("\n-- CIRURGIÃO --");
        cirurgiao.exibirDados();
        cirurgiao.realizarCirurgia();
    }
}
