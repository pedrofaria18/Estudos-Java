public class ControleFluxo1 {
    public static void main(String[] args) {
        // idade < 15 : categoria infantil
        // idade >= 15 && idade < 18 : categoria juvenil
        // idade >= 18 : categoria adulto
        int idade = 17;
        String categoria;

        if(idade < 15) {
            categoria = "infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "juvenil";
        } else {
            categoria = "adulto";
        }

        System.out.println("Você é pertencente a categoria " + categoria);
    }
}
