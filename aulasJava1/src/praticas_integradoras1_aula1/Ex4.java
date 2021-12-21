package praticas_integradoras1_aula1;

import java.util.Scanner;

public class Ex4 {

    //Desenvolva um programa para mostrar no console os primeiros n números primos entre 1
    //e m, sendo m um valor que o usuário irá inserir pelo console.

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        int num = 0;

        System.out.println("Digite um número: ");
        num = leia.nextInt();

        for (int i = 2; i <= num; i++) {
            if( primo(i) )
                System.out.println(i + " é primo.");
        }

    }

    private static boolean primo(int numero) {
        for (int j = 2; j < numero; j++) {
            if (numero % j == 0)
                return false;
        }
        return true;
    }

}
