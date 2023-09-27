package veiculo;

public class Carro extends Veiculo{
    private int numeroPortas;

    public Carro(String marca,String modelo,int anoFabricacao, int numeroPortas){
        super(marca, modelo, anoFabricacao);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void imprimirDetalhes(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano de fabricação: " + this.getAnoFabricacao());
        System.out.println("Número de portas: " + this.getNumeroPortas());

    }
}
