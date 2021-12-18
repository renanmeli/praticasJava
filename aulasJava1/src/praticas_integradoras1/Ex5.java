package praticas_integradoras1;

    //Desenvolver um programa para exibição por console os n primeiros números naturais que
    //têm pelo menos m dígitos de d, sendo n, m e d valores que o utilizador vai informar pelo
    //console.
    //Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir os primeiros 5
    //números naturais que tenham pelo menos 2 dígitos terminados em 3 no console. Neste
    //caso, a saída será: 33, 133 , 233, 303, 313.
    //Dependendo de como você decidir abordar a solução para este exercício, pode ser
    //necessário usar recursos que ainda não estudamos. Faz parte do desafio encontrar
    //soluções na Internet e utilizá-las.

    import java.util.Scanner;

    public class Ex5 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.print("Quantidade de numeros: ");
            int qtdNumeros = input.nextInt(); //n

            System.out.print("Quantidade mínima de digitos: ");
            int qtdDigitos = input.nextInt(); //m

            System.out.print("Digito final dos numeros: ");
            char digitoFinal = input.next().charAt(0);
            System.out.println("Lista de " + qtdNumeros + " com pelo menos " + qtdDigitos + " digitos com ultimo digito " + digitoFinal);
            filtrarNumeros(qtdNumeros, qtdDigitos, digitoFinal);

        }

        private static void filtrarNumeros(int qtdNum, int qtdDigitos, char digitoFinal) {

            Integer i = 0;
            do {
                char caractere = i.toString().charAt(i.toString().length() - 1);

                if (i.toString().length() >= qtdDigitos && caractere == digitoFinal) {
                    System.out.print(i + " ");
                    qtdNum--;
                }
                i++;
            } while (qtdNum>0);
        }
    }
