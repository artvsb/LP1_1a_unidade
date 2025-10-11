import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Funcionario a = new Funcionario();

        System.out.println("Insira o valor da hora trabalhada: ");
        a.setvHora(sc.nextInt());

        System.out.println("Insira sua jornada semanal em horas: ");
        a.setqHoras(sc.nextInt());

        System.out.println("Seu salário é igual a R$ " + a.calcularSal());

    }
}
