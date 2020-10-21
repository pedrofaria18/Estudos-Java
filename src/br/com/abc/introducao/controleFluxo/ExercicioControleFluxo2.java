package br.com.abc.introducao.controleFluxo;

public class ExercicioControleFluxo2 {
    public static void main(String[] args) {
        /*
        Crie um switch que dado um valor de 1 a 7,
        considerando 1 domingo, imprima se é dia util ou final de semana
         */

        byte dia = 3;
        String qualDia = null;

        switch (dia) {
            case 1:
            case 7:
                qualDia = "final de semana";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                qualDia = "dia útil";
                break;
            default:
                System.out.println("Dia da semana inválido");
        }

        System.out.println(qualDia);
    }
}
