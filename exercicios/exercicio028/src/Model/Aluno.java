package Model;

public class Aluno extends Pessoa {
    private String curso;
    private int fase;

    // O único construtor correto
    public Aluno(int id, String nome, int idade, String curso, int fase){
        // Chama o construtor da classe pai (Pessoa) para inicializar os atributos herdados
        super(idade, nome, idade);

        // Inicializa os atributos específicos de Aluno
        this.curso = curso;
        this.fase = fase;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }
}