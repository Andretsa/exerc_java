package cadastro;

class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double calcularBonus() {
        double bonus = getSalario() * 0.10;
        return bonus;
    }
}
