package pratica_integradora1_tt;

public class PasswordForte extends Senha {

    public PasswordForte(String regex) {
        super(regex);
    }

    @Override
    public void mensagemErro() {
        throw new SecurityException("Sua senha não está forte");
    }
}
