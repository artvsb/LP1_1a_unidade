import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        Funcionario f = new Funcionario();

        System.out.println("Digite seu nome: ");
        f.setNome(tcl.nextLine());
        System.out.println("Insira sua matrícula: ");
        f.setMat(tcl.nextInt());
        System.out.println("Digite o seu salário: ");
        f.setSal(tcl.nextDouble());

        f.exibirInfos();
        f.calcularINSS();
        System.out.println("Seu salário terá um desconto de " + f.getDesconto());

        f.calcularSalarioLiquido();
        System.out.println("Seu salário líquido é igual a " + f.getSalLiq());
        f.exibirContracheque();
    }
}