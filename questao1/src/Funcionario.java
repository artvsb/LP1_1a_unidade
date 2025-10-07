public class Funcionario {
	private String nome;
	private int mat;
	private double sal;
	double desconto;
	double salLiq;

	public Funcionario() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public void exibirInfos() {
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + mat);
		System.out.println("Salário: " + sal);
	}

	public void calcularINSS() {
		desconto = sal * 0.15;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public void calcularSalarioLiquido() {
		salLiq = sal * 0.85;
	}

	public double getSalLiq() {
		return salLiq;
	}

	public void setSalLiq(double salLiq) {
		this.salLiq = salLiq;
	}

	public void exibirContracheque() {
		System.out.println("**** FOLHA DE PAGAMENTO ****");
		System.out.println("Nome: " + nome);
		System.out.println("Matrícula: " + mat);
		System.out.println("Salário Bruto: " + sal);
		System.out.println("Desconto INSS: " + desconto);
		System.out.println("Salário Líquido: " + salLiq);
		System.out.println("****************************");
	}
}
