package Model;

public class Pessoa {
    // Atributos
    private int id;
    private String nome;
    private int idade;


    public Pessoa() {
        // Inicialização padrão, se necessário
    }

    // O construtor completo (com parâmetros)
    public Pessoa(int id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}