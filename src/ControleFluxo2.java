public class ControleFluxo2 {
    public static void main(String[] args) {
        int idade = 20;
        String status;

        if(idade < 18) {
            status = "Não adulto";
        } else {
            status = "Adulto";
        }
        System.out.println(status);


        // OPERADOR TERNÁRIO = SIMPLIFICAÇÃO DE IF/ELSE
        // status = idade < 18 ? <true> : <false>;
        status = idade < 18 ? "Não adulto" : "Adulto";
        System.out.println(status);


        // NÃO É RECOMENDADO UTILIZAR ESSE TIPO DE OPERADOR COM MAIS DE DUAS INSTRUÇÕES
        status = idade < 15 ? "Infantil" : idade >= 15 && idade < 18 ? "juvenil" : "adulto";
        System.out.println(status);
    }
}
