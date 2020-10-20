public class Arrays3 {
    public static void main(String[] args) {

        //Formas de inicar um array:
        // 1 - int [] numeros = new int[5];
        // 2 - int [] numeros = {1, 2, 3, 4, 5}
        // 3 - int [] numeros = new int[]{1, 2, 3, 4, 5}

        int [] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
