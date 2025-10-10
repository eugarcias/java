package Model;

public class Aluno extends Pessoa {
    private String curso;
    private String matricula;

    public Aluno (int id, String nome, int idade, String curso, String matricula){
        super(id, nome, idade);
        this.curso = curso;
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString(){
        return "--- Dados do Aluno ---\n" +
                super.toString() +
                "\nMatricula: " + matricula +
                "\nCurso: " + curso;
    }
}
