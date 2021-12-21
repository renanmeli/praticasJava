package pratica_integradora_radixsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    //classificar os elementos do array de acordo com o valor da última posição.

    //Atribuir os valores de int inteirosArray[] para String stringsArray[].

    public static void radixSort(int iArr[]) {

        String[] sArr = new String[iArr.length];

        int maxLength = 0;

        int cont = 0; //contadora
        for (int elemento : iArr) { //teste forEach
            sArr[cont] = String.valueOf(iArr[cont]); //converte para string

            if (sArr[cont].length() > maxLength) { //pega o tamanho do maior numero
                maxLength = sArr[cont].length();
            }

            cont++;
        }

        //Completar stringsArray[] com 0 (zeros) à esquerda (coincidindo com o número
        //de dígitos do maior número de inteirosArray[]).

        for (int i = 0; i < sArr.length; i++) {
            if (sArr[i].length() < maxLength) {
                int tamanhoDif = sArr[i].length() - maxLength;

                String zeros = "";

                while (tamanhoDif < 0) {
                    zeros += "0";
                    tamanhoDif++;
                }
                sArr[i] = zeros + sArr[i];
            }
        }
        System.out.println(Arrays.toString(sArr));


        //Criar 10 listas inicialmente vazias. L0 (será a lista para colocar os números que
        //terminam com 0 (zero), em L1 colocaremos os números que terminam com 1,
        //e assim por diante até L9.
        List<List<String>> listaCom10 = new ArrayList<>(); // cria uma lista de listas

        for (int y = 0; y < 10; y++) {
            //adiciona uma lista sem nome na lista de listas
            listaCom10.add(new ArrayList<String>());
        }

        //Percorrer stringsArray[] para cada elemento, verificar qual é o seu último dígito
        //e adicionar à lista L0, L1, L2, ... até L9 correspondente (conforme passo 3).
        for (String i : sArr) {
            int digito = Integer.valueOf(i.substring(i.length() - 1));
            listaCom10.get(digito).add(i);
        }


        //Odenando os elementos da lista ordem crescente sem usar o sort()
        for (List l : listaCom10) {
            for (int i = 0; i <= l.size() - 1; i++) {
                for (int j = 0; j <= l.size() - 2; j++) {
                    if (Integer.valueOf(l.get(j).toString()) > Integer.valueOf(l.get(j + 1).toString())) {
                        String temp = l.get(j).toString();
                        l.set(j, l.get(j + 1));
                        l.set(j + 1, temp);
                    }
                }
            }

        }

        System.out.println(listaCom10);
    }


    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        radixSort(iArr);

        for (int i: iArr) {
            System.out.print(i + "a ");
        }

    }

}
