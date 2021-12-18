package aula1;

import java.util.concurrent.ThreadLocalRandom;

public class Programa {

    public static void main(String[] args) {
        /*Produto produto = new Produto();
        Vendedor vendedor = new Vendedor();

        produto.setCodigo("MLB34567");
        produto.setNome("PS5");
        produto.setPreco(5000.00);

        vendedor.nome = "Aldadir";
        vendedor.sexo = 'M';

        System.out.println(produto);*/

        int tamanho = 10;
        int[] vetor = new int[10];

        for(int i=0; i<vetor.length; i++){
            vetor[i] = ThreadLocalRandom.current().nextInt(50, 900);
        }

        int contador = 0;
    // o instrutor nos disse pra evitar usar o while sempre que possível
        while(contador < tamanho){
            System.out.println(vetor[contador]);
            contador +=1;
        }


    }
}
