public class Funcionario {
    int vHora;
    int vSal;
    int qHoras;

    public int getqHoras(int i) {
        return qHoras;
    }

    public void setqHoras(int qHoras) {
        this.qHoras = qHoras;
    }

    public int getvHora(int i) {
        return vHora;
    }

    public void setvHora(int vHora) {
        this.vHora = vHora;
    }

    public int getvSal() {
        return vSal;
    }

    public void setvSal(int vSal) {
        this.vSal = vSal;
    }

    public int calcularSal() {
        vSal = vHora * qHoras;
        return vSal;
    }


}
