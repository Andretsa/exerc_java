package veiculo;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;

    public Veiculo(String marca, String modelo, int anoFabricacao){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }
}
