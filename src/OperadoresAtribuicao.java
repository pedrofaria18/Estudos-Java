public class OperadoresAtribuicao {
    public static void main(String[] args) {
        int salario = 1800;

        // somar
        salario += 1000; // salario = salario + 1000
        System.out.println(salario); // 2800

        // subtrair
        salario -= 1000; // salario = salario - 1000
        System.out.println(salario); // 1800

        // multiplicar
        salario *= 0.1; // salario = salario * 0.1
        System.out.println(salario); // 180

        // dividir
        salario /= 2; // salario = salario / 2
        System.out.println(salario); // 90

        // resto
        salario %= 2; // salario = salario % 2
        System.out.println(salario); // 0
    }
}
