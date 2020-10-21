package br.com.abc.javacore.introducaoMetodos.teste;

import br.com.abc.javacore.introducaoMetodos.classes.Calculadora;

public class CalculadoraTeste {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // SIMPLES
        calc.somaDoisNumeros();


        // COM ARGUMENTO
        calc.multiplicaDoisNumeros(5, 5);


        // COM RETORNO
        // jeito 1
        System.out.println(calc.divideDoisNumeros(20, 5));
        // jeito 2
        double resultado = calc.divideDoisNumeros(20, 2);
        System.out.println(resultado);


        // COM RETORNO 2
        double resultado2 = calc.divideDoisNumerosComIf(20, 0);
        System.out.println(resultado2);


        // VOID COM RETURN SERVINDO DE BREAK
        calc.divideDoisNumerosVoid(20, 0);
    }
}
