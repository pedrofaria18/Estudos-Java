package br.com.abc.javacore.introducaoMetodos.teste;

import br.com.abc.javacore.introducaoMetodos.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "123.123.123-12";
        prof.matricula = "123456";
        prof.nome = "Pedro";
        prof.rg = "123456-1";

        Professor prof2 = new Professor();
        prof2.cpf = "123.123.123-12";
        prof2.matricula = "987654";
        prof2.nome = "João";
        prof2.rg = "123456-1";

        // Parâmetro de tipo reference: manda um sinal para o objeto
        prof.imprime(prof);
        prof.imprime(prof2);
        /*
         tanto faz usar o prof ou prof2 para chamar o método imprime,
         pois ambas fazem referencia ao mesmo objeto (Professor),
         sendo ele que irá executar

         porêm ao passar os argumentos, você tem que passar o local da memória
         onde está armazenado, ou seja, prof e prof2
         */



        /* Parâmetro de tipo this: utiliza para pegar o valor de dentro objeto
           (endereço de memória que se encontra)
        */
        prof.imprime2();
        prof2.imprime2();

    }
}
