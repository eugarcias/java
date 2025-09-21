package Model;

public class Aluno {
    private String curso;
    private int fase;

    public Aluno(){

    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno (String curso, int fase){
        this.curso = curso;
        this.fase = fase;

    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
}

