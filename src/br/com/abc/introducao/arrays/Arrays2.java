package br.com.abc.introducao.arrays;

public class Arrays2 {
    public static void main(String[] args) {
        int [] idades = new int[3];

        System.out.println("Idade 1: " + idades[0]); // 0
        System.out.println("Idade 2: " + idades[1]); // 0
        System.out.println("Idade 3: " + idades[2]); // 0


        //byte, short, int, long, float, double = recebem o valor 0 (zero) ao serem criados
        // char = recebe o valor vazio ( ' ', ou '\u0000' )
        // boolean = recebe o valor false
        // reference (ex : String) = recebe o valor null


        String [] nomes = new String[3];
        nomes[0] = "Pedro";
        nomes[1] = "Henrique";
        nomes[2] = "Faria";

        System.out.println(nomes.length); // length = tamanho do array

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }


        nomes = new String[4]; // a referencia começa a ser a partir daqui, perdendo valores anteriores

        for(int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
