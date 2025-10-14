package Model;

public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario (int id, String nome, int idade, String cargo, double salario ){
        super(id,nome,idade);
        this.cargo = cargo;
        this.salario = salario;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString(){
        return "--- Dados do Funcionário ---\n" +
                super.toString() +
                "\nCargo: " + cargo +
                "\nSalário: " +  String.format("%.2f", salario);
    }
}
