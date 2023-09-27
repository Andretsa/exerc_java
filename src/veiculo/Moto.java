package veiculo;

public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String marca,String modelo,int anoFabricacao, int cilindradas){
        super(marca, modelo, anoFabricacao);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void imprimirDetalhes(){
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ano de fabricação: " + this.getAnoFabricacao());
        System.out.println("Cilindradas: " + this.getCilindradas());

    }
}
