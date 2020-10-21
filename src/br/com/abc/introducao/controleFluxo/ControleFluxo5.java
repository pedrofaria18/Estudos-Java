package br.com.abc.introducao.controleFluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        /*
        Dado o valor de um carro em quantas vezes ele pode ser parcelado,
        com as parcelas não podendo ser menor que 1000
         */

        double valorTotal = 30000;

        for( int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + ", R$ " + valorParcela);
        }


    }
}
