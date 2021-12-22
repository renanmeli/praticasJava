package pratica_integradora1_tt;

public class PasswordMedia extends Senha {

    public PasswordMedia(String regex) {
        super(regex);
    }

    @Override
    public void mensagemErro() {
        throw new SecurityException("Sua senha não está cumprindo os requisitos pra senha media");
    }
}
