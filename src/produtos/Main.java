package produtos.produtos;

public class Main {
    public static void main(String[] args) {
        Produto livro = new Livro("Livro", 50.0);
        Produto eletronico = new Eletronico("Eletrônico", 500.0);
        Produto roupa = new Roupa("Roupa", 100.0);

        livro.exibirDetalhes();
        eletronico.exibirDetalhes();
        roupa.exibirDetalhes();
    }
}