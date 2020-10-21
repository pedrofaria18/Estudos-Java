package br.com.abc.introducao.controleFluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        int contador = 0;

        // Lê antes de executar
        while (contador < 10) { // enquanto contador < 10 faça
            System.out.println(contador); // imprima
            contador++; // some mais 1
        }

        // Executa pelo menos uma vez antes de ler
        do {
            System.out.println(contador);
        } while (contador < 10);


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
