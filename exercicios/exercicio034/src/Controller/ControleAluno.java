package Controller; // Ajuste o pacote conforme necessário

import Model.Aluno;
import java.util.ArrayList;

public class ControleAluno {
    
    // Lista onde os alunos seriam armazenados (simulação)
    private ArrayList<Aluno> MinhaLista;

    public ControleAluno() {
        this.MinhaLista = new ArrayList<>();
    }

    // Método que o seu código View está tentando acessar
    public ArrayList<Aluno> getMinhaLista() {
        // Se a classe Aluno tiver um controlador, ela deveria chamar o BD aqui
        // Mas para fins de compilação, retornamos a lista interna.
        return MinhaLista;
    }
    
    // Método para adicionar um aluno (opcional, dependendo do seu design)
    public void adicionarAluno(Aluno a) {
        this.MinhaLista.add(a);
    }
}