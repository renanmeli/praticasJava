package pratica_integradora2_tt;

public class Diretor extends Funcionario{


    public Diretor(double salarioBase, int metaBatida, double lucroEmpresa) {
        super(salarioBase, metaBatida, lucroEmpresa);
    }

    @Override
    public double pagarSalario(double salarioBruto) {
        double partLucro = 0.03;
        return super.pagarSalario(salarioBruto + (getLucroEmpresa() * partLucro));
    }
}
