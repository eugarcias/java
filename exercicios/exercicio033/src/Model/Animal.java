package Model;

public abstract class  Animal {
    private static int proximoId = 1;
    private int id;
    private String nome;

    public Animal(String nome) {
        this.id = proximoId++;
        this.nome = nome;

    }
    public abstract String emitirSom();

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString(){
       return "ID: " + id + ", Nome: " + nome;
    }
}
