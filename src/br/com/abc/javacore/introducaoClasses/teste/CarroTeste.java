package br.com.abc.javacore.introducaoClasses.teste;

import br.com.abc.javacore.introducaoClasses.classes.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.placa = "PJL2020";
        carro.modelo = "Audi TT";
        carro.velocidadeMaxima = 250;

        System.out.println(carro.placa);
        System.out.println(carro.modelo);
        System.out.println(carro.velocidadeMaxima);
    }
}
