package praticas_integradoras1_aula1;

import java.util.Scanner;

public class Ex1 {

    //Desenvolva um programa para mostrar os primeiros n números pares, sendo n um valor
    //que o usuário irá inserir pelo console. Lembre-se que um número é par quando divisível por
    //2.

    public static void main(String[] args) {

        //variaveis
        Scanner leia = new Scanner(System.in);
        int num = 0;

        //entrada
        System.out.print("Digite um número: ");
        num = leia.nextInt();

        //processamento
        for(int i=0; i<num; i++ ){
            System.out.println(i*2);
        }

    }
}
