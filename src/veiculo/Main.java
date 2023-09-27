package veiculo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Hyundai","Civic", 2022, 4);
        Moto moto = new Moto("Honda", "150", 2020, 50);


        carro.imprimirDetalhes();
        moto.imprimirDetalhes();


    }

}
