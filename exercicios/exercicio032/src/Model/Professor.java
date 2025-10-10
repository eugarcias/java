package Model;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor (int id, String nome, int idade, double salario, String disciplina){
        super(id, nome, idade, "professor", salario);
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
