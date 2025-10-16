package View;

import Model.Animal;
import Model.Cachorro;
import Model.Galinha;
import Model.Gato;
import javax.swing.JOptionPane;
import java.util.List;

public class AnimalView {

    public int menu() {
        String menuTexto = "--- ZOOLÓGICO --- \n\n" +
                "1 - Adicionar Animal\n" +
                "2 - Listar Animais\n" +
                "3 - Fazer um Animal emitir som\n" +
                "0 - Sair\n\n" +
                "Escolha uma opção:";
        try {
            String opcStr = JOptionPane.showInputDialog(null, menuTexto, "Menu Principal", JOptionPane.QUESTION_MESSAGE);
            if (opcStr == null) {
                return 0;
            }
            return Integer.parseInt(opcStr);
        } catch (NumberFormatException e) {
            exibirMensagem("Erro: Por favor, digite um número válido.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public Animal obterDadosParaNovoAnimal() {
        String nome = JOptionPane.showInputDialog(null, "Digite o nome do animal:", "Novo Animal", JOptionPane.PLAIN_MESSAGE);
        if (nome == null || nome.trim().isEmpty()) return null;

        String tipoStr = JOptionPane.showInputDialog(null, "Digite o tipo (1=Cachorro, 2=Gato, 3=Galinha):", "Tipo de Animal", JOptionPane.PLAIN_MESSAGE);
        if (tipoStr == null) return null;

        try {
            int tipo = Integer.parseInt(tipoStr);
            if (tipo == 1) {
                return new Cachorro(nome);
            } else if (tipo == 2) {
                return new Gato(nome);
            } else if (tipo == 3) {
                return new Galinha(nome);
            } else {
                exibirMensagem("Tipo de animal inválido!", "Erro", JOptionPane.WARNING_MESSAGE);
                return null;
            }
        } catch (NumberFormatException e) {
            exibirMensagem("Tipo deve ser um número (1, 2 ou 3).", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public void listarAnimais(Animal[] animais, int totalDeAnimais) {
        if (totalDeAnimais == 0) {
            exibirMensagem("Nenhum animal cadastrado.", "Lista de Animais", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        StringBuilder listaTexto = new StringBuilder("--- LISTA DE ANIMAIS ---\n\n");
        for (int i = 0; i < totalDeAnimais; i++) {
            listaTexto.append(animais[i].toString()).append("\n");
        }

        exibirMensagem(listaTexto.toString(), "Lista de Animais", JOptionPane.INFORMATION_MESSAGE);
    }

    public int obterIdAnimal() {
        try {
            String idStr = JOptionPane.showInputDialog(null, "Digite o ID do animal:", "Buscar Animal", JOptionPane.QUESTION_MESSAGE);
            if (idStr == null) return -1;
            return Integer.parseInt(idStr);
        } catch (NumberFormatException e) {
            exibirMensagem("ID deve ser um número.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
    }

    public void exibirSom(Animal animal) {
        String mensagem = "O animal " + animal.getNome() + " faz: " + animal.emitirSom();
        exibirMensagem(mensagem, "Som do Animal", JOptionPane.INFORMATION_MESSAGE);
    }

    public void exibirMensagem(String mensagem, String titulo, int tipoMensagem) {
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipoMensagem);
    }
}