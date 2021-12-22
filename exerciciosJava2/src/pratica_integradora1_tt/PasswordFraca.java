package pratica_integradora1_tt;

public class PasswordFraca extends Senha{

    public PasswordFraca(String regex) {
        super(regex);
    }

    @Override
    public void mensagemErro() {
        throw new SecurityException("Sua senha não está cumprindo os requisitos pra senha fraca");
    }
}
