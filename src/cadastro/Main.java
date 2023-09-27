package cadastro;

import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        System.out.println("Cadastro de Funcionários");
        System.out.println("------------------------");

        System.out.print("Digite o nome do Gerente: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Digite o salário do Gerente: ");
        double salarioGerente = scanner2.nextDouble();

        System.out.print("Digite o departamento do Gerente: ");
        String departamentoGerente = scanner.nextLine();

        System.out.print("Digite o nome do Diretor: ");
        String nomeDiretor = scanner.nextLine();
        System.out.print("Digite o salário do Diretor: ");
        double salarioDiretor = scanner2.nextDouble();


        System.out.print("Digite a quantidade de ações do Diretor: ");
        int acoesDiretor = scanner2.nextInt();

        Gerente gerente = new Gerente(nomeGerente, salarioGerente, departamentoGerente);
        Diretor diretor = new Diretor(nomeDiretor, salarioDiretor, acoesDiretor);

        System.out.println("\nDados dos Funcionários");
        System.out.println("----------------------");
        System.out.println("Gerente:");
        System.out.println("Nome: " + gerente.getNome().toUpperCase());
        System.out.println("Salário: " + gerente.getSalario());
        System.out.println("Departamento: " + gerente.getDepartamento().toUpperCase());
        System.out.println("Bônus: " + gerente.calcularBonus());

        System.out.println("\nDiretor:");
        System.out.println("Nome: " + diretor.getNome().toUpperCase());
        System.out.println("Salário: " + diretor.getSalario());
        System.out.println("Ações: " + diretor.getAcoes());

    }
}