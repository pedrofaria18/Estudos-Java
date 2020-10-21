package br.com.abc.javacore.introducaoClasses.teste;

import br.com.abc.javacore.introducaoClasses.classes.Estudante;

public class EstudanteTeste {
    public static void main(String[] args) {

        /*
        Temos uma variável de referencia chamada pedro,
        de tipo Estudante e que faz referencia a um
        objeto do tipo Estudante
         */
        Estudante pedro = new Estudante();
        pedro.nome = "Pedro";
        pedro.matricula = "699416";
        pedro.idade = 19;

        System.out.println(pedro.nome);
        System.out.println(pedro.matricula);
        System.out.println(pedro.idade);


    }
}
