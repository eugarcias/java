package Controller;

import Model.Animal;
import View.AnimalView;

public class AnimalController {
    private Animal[] listaDeAnimais;
    private int totalDeAnimais;
    private AnimalView view;

    public AnimalController() {
        // Nosso zoológico terá capacidade máxima de 10 animais
        this.listaDeAnimais = new Animal[10];
        this.totalDeAnimais = 0;
        this.view = new AnimalView();
    }

    public void iniciar() {
        int opcao;
        do {
            opcao = view.menu();
            switch (opcao) {
                case 1:
                    adicionarAnimal();
                    break;
                case 2:
                    listarAnimais();
                    break;
                case 3:
                    ouvirSomAnimal();
                    break;
                case 0:
                    view.exibirMensagem("Saindo do sistema...", "Até logo", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case -1:
                    // Opção inválida já tratada na View, não faz nada aqui
                    break;
                default:
                    view.exibirMensagem("Opção inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } while (opcao != 0);
    }

    private void adicionarAnimal() {
        if (totalDeAnimais < listaDeAnimais.length) {
            Animal novoAnimal = view.obterDadosParaNovoAnimal();
            if (novoAnimal != null) {
                listaDeAnimais[totalDeAnimais] = novoAnimal;
                totalDeAnimais++;
                view.exibirMensagem("Animal adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            view.exibirMensagem("O zoológico está lotado! Não é possível adicionar mais animais.", "Zoológico Cheio", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void listarAnimais() {
        view.listarAnimais(listaDeAnimais, totalDeAnimais);
    }

    private void ouvirSomAnimal() {
        int id = view.obterIdAnimal();
        if (id == -1) return; // Usuário cancelou ou digitou entrada inválida

        Animal animalEncontrado = null;
        for (int i = 0; i < totalDeAnimais; i++) {
            if (listaDeAnimais[i].getId() == id) {
                animalEncontrado = listaDeAnimais[i];
                break;
            }
        }

        if (animalEncontrado != null) {
            view.exibirSom(animalEncontrado);
        } else {
            view.exibirMensagem("Animal com ID " + id + " não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}