package pratica_integradora2_tt;

public class Analista extends Funcionario{

    public Analista(double salarioBase, int metaBatida) {
        super(salarioBase, metaBatida);
    }

    @Override
    public double pagarSalario(double salarioBruto) {
        double porcentoBonus = 0.08;
        return super.pagarSalario(salarioBruto + ((salarioBruto * porcentoBonus)*getMetaBatida()));
    }
}
