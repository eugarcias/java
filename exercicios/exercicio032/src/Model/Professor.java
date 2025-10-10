package Model;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor (String nome, int idade, double salario, String disciplina){
        super (nome, idade, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString(){
        return "--- DADOS DO PROFESSOR ---\n" +
                super.toString() +
                "\nDisciplina: " + disciplina;
    }
}
