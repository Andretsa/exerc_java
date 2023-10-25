package produtos.produtos;

import produtos.produtos.Produto;
import produtos.produtos.Promocao;

public class Livro extends Produto implements Promocao {
    public Livro(String nome, double preco) {

        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.9; // Desconto de 10%
    }
}