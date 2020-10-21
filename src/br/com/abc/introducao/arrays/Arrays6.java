package br.com.abc.introducao.arrays;

public class Arrays6 {
    public static void main(String[] args) {
        int [][] numeros = new int[3][];

        numeros[0] = new int[2];
        numeros[1] = new int[]{1, 2, 3};
        numeros[2] = new int[4];

        for (int[] ref : numeros) {
            for (int numero : ref) {
                System.out.println(numero);
            }
        }


        System.out.println();


        System.out.println("Segunda forma facilitada");
        int [][] numeros2 = {{0, 0}, {1, 2, 3}, {0, 0, 0, 0}};

        for (int[] ref2 : numeros2) {
            for (int numero2 : ref2) {
                System.out.println(numero2);
            }
        }
    }
}
