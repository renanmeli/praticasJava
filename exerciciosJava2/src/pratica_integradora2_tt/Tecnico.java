package pratica_integradora2_tt;

public class Tecnico extends Funcionario {

    public Tecnico(double salarioBase, int metaBatida) {
        super(salarioBase, metaBatida);
    }

    @Override
    public double pagarSalario(double salarioBruto) {
        double porcentoBonus = 0.05;
        return super.pagarSalario(salarioBruto + ((salarioBruto * porcentoBonus)*getMetaBatida()));
    }
}
