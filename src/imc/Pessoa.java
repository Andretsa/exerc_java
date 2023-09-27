package imc;

public class Pessoa {
    private double peso;
    private double altura;

    // Construtor da classe Pessoa = Quais sao os atributos relevantes para tal objeto?
    // pode ser usado sem nenhum parametro ou com os relevantes
    /*public Pessoa() {
        this.peso = 0;
        this.altura = 0;
    }*/

    // Método para calcular o IMC
    public String calcularIMC() {
        double imc = peso / (altura * altura);
        String mensagem = "";
        // Interpretar o IMC
        if (imc < 18.5) {
            mensagem = "Você está abaixo do peso.";
        } else if (imc < 24.9) {
            mensagem = "Seu peso está dentro da faixa saudável.";
        } else if (imc < 29.9) {
            mensagem ="Você está com sobrepeso.";
        } else {
            mensagem ="Você está obeso.";
        }
        // Formatando o valor do IMC com duas casas decimais
        String imcFormatado = String.format("%.2f", imc);
        // Retorna o IMC e a mensagem de interpretação
        return ("O IMC da pessoa é: " + imcFormatado + ".\n" + mensagem);
    }

    // Métodos getters e setters para peso
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Métodos getters e setters para altura
    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

