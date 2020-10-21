package br.com.abc.introducao.controleFluxo;

public class ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;

        // Switch é lido de cima para baixo, por isso é necessario do break pois quando entrar em algum case não leia todos os de baixo
        // Variáveis que pode ir dentro do switch: char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }

        char sexo = 'F';

        switch (sexo) {
            case 'F':
                System.out.println("Feminimo");
                break;
            case 'M':
                System.out.println("Masculino");
                break;
            default: // comando para opção inválida
                System.out.println("Opção inválida");
                break;
        }
    }
}
