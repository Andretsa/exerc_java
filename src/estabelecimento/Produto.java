package estabelecimento;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEmEstoque += quantidade;
            System.out.println(quantidade + " unidades de " + nome + " adicionadas ao estoque.");
        } else {
            System.out.println("Quantidade inválida. Não foi possível adicionar ao estoque.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " unidades de " + nome + " vendidas.");
        } else {
            System.out.println("Quantidade insuficiente em estoque para vender " + quantidade + " unidades de " + nome + ".");
        }
    }

    public void exibirEstoque() {
        System.out.println("Estoque de " + nome + ": " + quantidadeEmEstoque + " unidades.");
    }
}
