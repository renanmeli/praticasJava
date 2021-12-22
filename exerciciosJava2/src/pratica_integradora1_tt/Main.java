package pratica_integradora1_tt;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        try {

            //Mínimo de oito caracteres, pelo menos uma letra e um número:
            PasswordFraca senhaFraca = new PasswordFraca("^(?=.*[A-Za-z])(?=.*\\d)[A-Za-z\\d]{8,}$");
            senhaFraca.setValue("senhafraca123");

            //8 caracteres, contendo ao menos um numero e um caractere especial
            PasswordMedia senhaMedia = new PasswordMedia("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
            senhaMedia.setValue("senhamedia123@");

            //8 caracteres contendo ao menos uma letra maiuscula, uma letra minuscula, um numero e um caractere especial
            PasswordForte senhaForte = new PasswordForte("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$");
            senhaForte.setValue("senhaForte123#*!");

        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }

    }
}