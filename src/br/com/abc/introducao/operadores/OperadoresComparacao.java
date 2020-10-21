package br.com.abc.introducao.operadores;

public class OperadoresComparacao {
    public static void main(String[] args) {
        // Maior
        boolean dezMaiorQueVinte = 10 > 20;
        System.out.println(dezMaiorQueVinte); // false

        // Menor
        boolean dezMenorQueVinte = 10 < 20;
        System.out.println(dezMenorQueVinte); // true

        // MaiorIgual
        boolean dezMaiorIgualQueVinte = 10 >= 20;
        System.out.println(dezMaiorIgualQueVinte); // false

        // MenorIgual
        boolean dezMenorIgualQueVinte = 10 <= 20;
        System.out.println(dezMenorIgualQueVinte); // true

        // Igual
        boolean dezIgualQueVinte = 10 == 20;
        System.out.println(dezIgualQueVinte); // false

        // Diferente
        boolean dezDiferenteQueVinte = 10 != 20;
        System.out.println(dezDiferenteQueVinte); // true
    }
}
