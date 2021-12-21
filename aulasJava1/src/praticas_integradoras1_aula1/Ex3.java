package praticas_integradoras1_aula1;

import java.util.Scanner;

public class Ex3 {

    //Desenvolva um programa para informar se um um número n é primo ou não, sendo n um
    //valor que o usuário irá inserir pelo console. Lembre-se que um número é primo quando só é
    //divisível por 1 e por si mesmo.

    public static void main(String[] args) {

        //variaveis
        Scanner leia = new Scanner(System.in);
        int num = 0;

        //entrada
        System.out.print("Digite um numero: ");
        num = leia.nextInt();

        //processamento
        if(num == 0 || num == 1){
            System.out.println(num+" não é primo");
        }
        else if(num <= 2){
            System.out.println(num+" é primo");
        }

        for(int i=2; i<num; i++){
            if(num % i == 0){
                System.out.println(num+" é primo");
                break;
            }
            else{
                System.out.println(num+" não é primo");
                break;
            }
        }
    }
}
