public class Funcionario {
    private String Nome;
    private int Mat;
    private double Sal;
    double desconto;
    double salLiq;

    public Funcionario() {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public int getMat() {
        return Mat;
    }

    public void setMat(int mat) {
        this.Mat = mat;
    }

    public double getSal() {
        return Sal;
    }

    public void setSal(double sal) {
        this.Sal = sal;
    }

    public void exibirInfos() {
        System.out.println("Nome: " + Nome);
        System.out.println("Matrícula: " + Mat);
        System.out.println("Salário: " + Sal);
    }

    public void calcularINSS() {
        desconto = Sal * 0.15;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public void calcularSalarioLiquido() {
        salLiq = Sal * 0.85;
    }

    public double getSalLiq() {
        return salLiq;
    }

    public void setSalLiq(double salLiq) {
        this.salLiq = salLiq;
    }

    public void exibirContracheque() {
        System.out.println("Nome: " + Nome);
        System.out.println("Matrícula: " + Mat);
        System.out.println("Salário Bruto: " + Sal);
        System.out.println("Desconto INSS: " + desconto);
        System.out.println("Salário Líquido: " + salLiq);

    }
}

