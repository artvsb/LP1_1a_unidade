import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        int op;
        Titulo tnt = new Titulo();
        System.out.println("-- BEM VINDO À PLATAFORMA TNT! --");
        do {
            System.out.println("Acesse a opção desejada: ");
            System.out.println("1. Cadastrar um novo título");
            System.out.println("2. Exibir detalhes do título");
            System.out.println("3. Avaliar um título");
            System.out.println("4. Exibir a média das avaliações");
            System.out.println("5. Encerrar o programa");
            System.out.println("---------------------------------");
            op = tc.nextInt();

            switch(op) {
                case 1:
                    System.out.println("Insira as informações abaixo: ");
                    tc.nextLine();
                    System.out.println("Título: ");
                    tnt.nome = tc.nextLine();
                    System.out.println("Gênero: ");
                    tnt.genero = tc.nextLine();
                    System.out.println("Ano de lançamento: ");
                    tnt.ano = tc.nextInt();
                    System.out.println("Duração em minutos: ");
                    tnt.duracao = tc.nextInt();
                    System.out.println("Título cadastrado com sucesso!");
                    break;
                case 2:
                    tnt.exibirDetalhes();
                    break;
                case 3:
                    System.out.println("Insira a nota que você dá ao título: ");
                    tnt.nota = tc.nextDouble();
                    tnt.avaliar(tnt.nota);
                    break;
                case 4:
                    tnt.media = tnt.somaNotas / tnt.qtdAvaliacoes;
                    System.out.println("A média de avaliações para este título é " + tnt.media);
                    break;
                case 5:
                    System.out.println("Obrigado por colaborar com a TNT Streaming! Volte Sempre! :D");
                    break;
                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
                    break;
            }


        } while (op != 5);


    }
}
