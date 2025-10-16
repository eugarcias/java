package Model;

public class Galinha extends Animal {
    public Galinha(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom() {
        return "Pó pó pó!";
    }
}