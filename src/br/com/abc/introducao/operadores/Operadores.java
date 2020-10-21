package br.com.abc.introducao.operadores;

public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        int numero2 = 20;


        // Soma
        System.out.println(numero1 + numero2); // 30

        // Subtração
        System.out.println(numero1 - numero2); // -10

        // Multiplicação
        System.out.println(numero1 * numero2); // 200

        // Divisão
        System.out.println(numero1 / numero2); // 0

        // Resto
        System.out.println(numero1 % numero2); // 0,10


        // OBSERVAÇÕES IMPORTANTES

        // A posição da string importa
        System.out.println("A soma é " + numero1 + numero2); // 1020
        System.out.println(numero1 + numero2 + " A soma é "); // 30

        // Para o caso de cima ocorrer corretamente ( colocando parenteses - indicando prioridade )
        System.out.println("A soma é " + (numero1 + numero2)); // 30

        // Para o caso de cima ocorrer corretamente ( criando uma variável )
        int soma = numero1 + numero2;
        System.out.println("A soma é " + soma); // 30
    }
}
