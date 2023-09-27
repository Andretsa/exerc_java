package imc;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();

        // Solicita o peso e a altura ao usuário
        System.out.print("Digite o peso da pessoa (em quilogramas): ");
        double peso = scanner.nextDouble();
        pessoa.setPeso(peso);

        System.out.print("Digite a altura da pesspa (em metros): ");
        double altura = scanner.nextDouble();
        pessoa.setAltura(altura);

        // Chama o método para calcular o IMC e exibe o resultado
        //Retorna a representação em string do argumento Object.
        //Parâmetros:
        //obj – um objeto.
        //Retorna:
        //se o argumento for nulo, então uma string igual a "null";
        // caso contrário, o valor de obj.toString() será retornado.
        //String resultado = String.valueOf((pessoa.calcularIMC()));
        System.out.println(pessoa.calcularIMC());

        //Fecha o objeto da classe Scanner
        scanner.close();
    }
}
