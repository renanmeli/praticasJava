package pratica_integradora1_tt;

public class Senha {

    //atributo
    private String password;
    private String regex;

    //construtor
    public Senha(String regex) {
        this.regex = regex;
    }

    //encapsulamento
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    //metodos
    public boolean valida(String password){
        return password.matches(regex);
    }

    public void setValue(String pwd) {
        if (valida(pwd)) {
            this.password = pwd;
        } else {
            mensagemErro();
        }
    }

    public void mensagemErro(){
        throw new SecurityException("A senha deve ter no mínimo 8 dígitos e conter pelo menos 1 caracter especial, 1 maiusculo, 1 numero");
    }


}
