package produtos.produtos;

import produtos.produtos.Produto;
import produtos.produtos.Promocao;

public class Eletronico extends Produto implements Promocao {
    public Eletronico(String nome, double preco) {

        super(nome, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPreco() * 0.95; // Desconto de 5%
    }
}
