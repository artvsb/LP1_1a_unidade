public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("João Silva", "123.456.789-00");
        Vendedor v1 = new Vendedor("Maria Souza", 101);
        Pedido p1 = new Pedido(1, "12/10/2025", 299.90, c1, v1);

        Cliente c2 = new Cliente("Ana Pereira", "987.654.321-00");
        Vendedor v2 = new Vendedor("Carlos Lima", 102);
        Pedido p2 = new Pedido(2, "13/10/2025", 1599.00, c2, v2);

        System.out.println();
        p1.exibirDados();

        System.out.println();
        p2.exibirDados();
    }
}

