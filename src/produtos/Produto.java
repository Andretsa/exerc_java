package produtos.produtos;

public abstract class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
    public abstract double calcularPrecoFinal();
    public void exibirDetalhes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço original: R$" + getPreco());
        System.out.println("Preço final: R$" + calcularPrecoFinal());
        System.out.println();
    }
}

