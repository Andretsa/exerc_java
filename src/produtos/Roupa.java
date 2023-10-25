package produtos.produtos;

import produtos.produtos.Produto;

public class Roupa extends Produto implements Promocao {
    public Roupa(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco(); //preco fixo
    }
}
