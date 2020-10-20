public class ExercicioControleFluxo3 {
    public static void main(String[] args) {
        /*
        Imprima todos os numeros pares de 0 até 100.000
         */

        int numero = 100000;

        for (int i = 0 ; i <= numero ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
