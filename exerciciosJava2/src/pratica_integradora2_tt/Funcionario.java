package pratica_integradora2_tt;

public class Funcionario {

    //atributos
    private double salarioBase;
    private int metaBatida;
    private double lucroEmpresa;

    //construtor
    public Funcionario(double salarioBase, int metaBatida, double lucroEmpresa) {
        this.salarioBase = salarioBase;
        this.metaBatida = metaBatida;
        this.lucroEmpresa = lucroEmpresa;
    }

    public Funcionario(double salarioBase, int metaBatida) {
        this.salarioBase = salarioBase;
        this.metaBatida = metaBatida;
    }

    //encapsulamento
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getMetaBatida() {
        return metaBatida;
    }

    public void setMetaBatida(int metaBatida) {
        this.metaBatida = metaBatida;
    }

    public double getLucroEmpresa() {
        return lucroEmpresa;
    }

    public void setLucroEmpresa(double lucroEmpresa) {
        this.lucroEmpresa = lucroEmpresa;
    }

    //metodos
    public double pagarSalario(double salarioBruto){
        return salarioBruto = this.salarioBase;
    }
}
