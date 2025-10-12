public class Pedido {
    int numero;
    String data;
    double valorTotal;
    Cliente cliente;   // associação: quem fez o pedido
    Vendedor vendedor; // associação: quem emitiu o pedido

    public Pedido(int numero, String data, double valorTotal, Cliente cliente, Vendedor vendedor) {
        this.numero = numero;
        this.data = data;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public void exibirDados() {
        System.out.println("-- DADOS DO PEDIDO --");
        System.out.println("Número: " + numero);
        System.out.println("Data: " + data);
        System.out.println("Valor total: R$ " + valorTotal);
        System.out.println("--- Cliente ---");
        cliente.exibirDados();
        System.out.println("--- Vendedor ---");
        vendedor.exibirDados();
        System.out.println("----------------------");
    }
}

