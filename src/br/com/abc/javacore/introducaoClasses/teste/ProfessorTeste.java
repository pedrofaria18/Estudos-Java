package br.com.abc.javacore.introducaoClasses.teste;

import br.com.abc.javacore.introducaoClasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor professor1 = new Professor();
        professor1.cpf = "999.999.999-99";
        professor1.matricula = "123456";
        professor1.nome = "Pedro";
        professor1.rg = "11-123.123";

        Professor professor2 = new Professor();
        professor2.cpf = "999.999.999-99";
        professor2.matricula = "123456";
        professor2.nome = "João";
        professor2.rg = "11-123.123";

        System.out.println(professor1.nome);
        System.out.println(professor1.cpf);
        System.out.println(professor1.rg);
        System.out.println(professor1.matricula);
        System.out.println("--------------------------------------");
        System.out.println(professor2.nome);
        System.out.println(professor2.cpf);
        System.out.println(professor2.rg);
        System.out.println(professor2.matricula);

        professor1 = professor2;
        /*
         o professor 1 se igualou ou professor 2, perdendo
         o lugar da memoria de professor1 e sendo referenciado
         no professor 2
         */

        System.out.println("--------------------------------------");
        System.out.println(professor2.nome);
        System.out.println(professor2.cpf);
        System.out.println(professor2.rg);
        System.out.println(professor2.matricula);

    }
}
