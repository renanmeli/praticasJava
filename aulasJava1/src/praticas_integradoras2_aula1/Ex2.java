package praticas_integradoras2_aula1;

import java.text.NumberFormat;

public class Ex2 {

    public static void main(String[] args) {

        NumberFormat reais = NumberFormat.getCurrencyInstance();

        double valorEmpresaX = 1130000.0; //1,13m
        double valorEmpresaY = 18400000.0; //18,4m

        double crescenteEmpresaX = 1.48; //148%
        double crescenteEmpresaY = 0.32; //32%

        int contadorAnos = 2021;

        System.out.println("Empresa X - 01/01/2021 - valor da empresa: "+reais.format(valorEmpresaX));
        System.out.println("Empresa Y - 01/01/2021 - valor da empresa: "+reais.format(valorEmpresaY));
        System.out.println();

        while(true){
            valorEmpresaX = valorEmpresaX + (valorEmpresaX * crescenteEmpresaX);
            valorEmpresaY = valorEmpresaY + (valorEmpresaY * crescenteEmpresaY);
            contadorAnos++;

            System.out.println("Empresa X - 01/01/"+contadorAnos+" - valor da empresa: "+reais.format(valorEmpresaX));
            System.out.println("Empresa Y - 01/01/"+contadorAnos+" - valor da empresa: "+reais.format(valorEmpresaY));
            System.out.println();

            if(valorEmpresaX > valorEmpresaY){
                break;
            }
        }

    }

}
