package praticas_integradoras2_aula1;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {

    public static void main(String[] args) {

        Produto p1 = new Produto("Arroz", 10.99, 2);
        Produto p2 = new Produto("Feijao", 14.49, 1);
        Produto p3 = new Produto("Tomate", 9.99, 5);

        List<Produto> produtos = new ArrayList<>();
        produtos.add(p1);
        produtos.add(p2);
        produtos.add(p3);

        for (Produto p : produtos) {
            System.out.println(p.toString());
        }
        System.out.println("Valor total: R$" + Produto.total);

    }


    static class Produto {
        private String nome;
        private double preco;
        private int quantidade;

        private static double total;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
            total += preco * quantidade;
        }

        @Override
        public String toString() {
            return nome + "\nR$" + preco + "\nQuantidade: " + quantidade + "\n";
        }
    }

}