package praticas_integradoras1_aula1;

import java.util.Scanner;

public class Ex2 {

    //Desenvolva um programa para mostrar os primeiros n números múltiplos de m, sendo n e
    //m valores que o usuário irá inserir via console. Lembre-se que um número a é divisível por b
    //quando o resto da divisão de a por b é igual a 0.

    public static void main(String[] args) {

        //variaveis
        Scanner leia = new Scanner(System.in);
        int numN = 0;
        int numM = 0;

        //entrada
        System.out.print("Digite um numero: ");
        numM = leia.nextInt();

        System.out.print("Quer quantos multiplos de: "+numM+"?: ");
        numN = leia.nextInt();

        //processamento
        for(int i=0; i<numN; i++){
                System.out.println(i*numM);
        }
    }
}
