package br.com.abc.introducao.arrays;

public class Arrays1 {
    public static void main(String[] args) {
        int [] idades = new int[3];
        // int idades []; -> não recomendado

        // Os indices do array começa do 0
        idades[0] = 20;
        idades[1] = 15;
        idades[2] = 30;

        System.out.println("Idade 1: " + idades[0]);
        System.out.println("Idade 2: " + idades[1]);
        System.out.println("Idade 3: " + idades[2]);

    }
}
