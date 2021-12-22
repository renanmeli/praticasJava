package pratica_integradora2_tt;

public class Gerente extends Funcionario{

    public Gerente(double salarioBase, int metaBatida) {
        super(salarioBase, metaBatida);
    }

    @Override
    public double pagarSalario(double salarioBruto) {
        double porcentoBonus = 0.125;
        return super.pagarSalario(salarioBruto + ((salarioBruto * porcentoBonus)*getMetaBatida()));
    }
}
