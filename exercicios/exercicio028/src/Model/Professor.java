package Model;

public class Professor {
    private double salario;
    private String profissao;


    public Professor (){

    }

    public Professor (double salario, String profissao){
        this.salario = salario;
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}

