package estabelecimento;

public class Main {
    public static void main(String[] args){
        Produto produto = new Produto("Produto A", 10.0, 50);

        produto.exibirEstoque();
        produto.adicionarEstoque(20);
        produto.exibirEstoque();
        produto.vender(15);
        produto.exibirEstoque();

    }
}
