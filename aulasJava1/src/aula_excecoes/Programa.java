package aula_excecoes;

public class Programa {

    public static void main(String[] args) {
        int a = 16;
        double b = 50;
        String nome = "Meli";
        metodo1();
        metodo2();
    }

    private static void metodo1() {
        System.out.println("metodo 1 em execucao");
        System.out.println("finalizando metodo 1");
    }

    private static void metodo2() {
        System.out.println("metodo 2 em execucao");
        try{
            metodo3();
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("finalizando metodo 2");
    }

    private static void metodo3() throws ArithmeticException{
        System.out.println("metodo 3 em execucao");
        int result = 10/0;
        System.out.println("finalizando metodo 3");
    }
}
