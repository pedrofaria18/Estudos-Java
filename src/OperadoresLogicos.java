public class OperadoresLogicos {
    public static void main(String[] args) {
        int idade = 18;
        float salario = 1000;

        // && = todas tem que ser verdadeira, para retornar true, ao contrário retorna falso
        System.out.println(idade >= 18 && salario >= 3000); // false

        // || = basta uma ser verdadeira, para retornar true, ao contrário retorna falso
        System.out.println(idade >= 18 && salario >= 3000); // true
    }
}
