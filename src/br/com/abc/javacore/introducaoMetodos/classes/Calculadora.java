package br.com.abc.javacore.introducaoMetodos.classes;

public class Calculadora {

    /*
     sintexe para métodos:
     modificador de métodos + tipo de retorno + nome
     */
    // public = pode ser acessado de qualquer lugar
    // void = executa porem não retorna



    // Método simples
    public void somaDoisNumeros() {
        System.out.println(5+5);
    }


    // Método com argumento
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }


    /* Método com retorno: quando um return é lido ele volta
       para quem o chamou, não executando o que tem a baixo
     */
    public double divideDoisNumeros (double num1, double num2) {
        return num1 / num2;
    }


    // Método com retorno e controle de fluxo
    public double divideDoisNumerosComIf (double num1, double num2) {
        if(num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }


    // Método void com controle de fluxo e utilizando o return de break
    public void divideDoisNumerosVoid (double num1, double num2) {
        if(num2 != 0) {
            System.out.println(num1/num2);
            return; // return serve como um break
        }
        System.out.println("Não é possivel dividir por 0");

    }




}
