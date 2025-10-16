package Controller;

import Model.Animal;
import View.AnimalView;
import javax.swing.JOptionPane;

public class AnimalController {

    private Animal[] listaDeAnimais;
    private int totalDeAnimais;
    private AnimalView view;


    public AnimalController() {

        this.listaDeAnimais = new Animal[10];
        this.totalDeAnimais = 0;
        this.view = new AnimalView();
    }

    // Método principal que inicia o programa e controla o fluxo
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

                    break;
                default:
                    view.exibirMensagem("Opção inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
            }
        } while (opcao != 0);
    }

    // Método privado para a lógica de adicionar animal
    private void adicionarAnimal() {

        if (totalDeAnimais < listaDeAnimais.length) {
            Animal novoAnimal = view.obterDadosParaNovoAnimal();


            if (novoAnimal != null) {
                listaDeAnimais[totalDeAnimais] = novoAnimal;
                totalDeAnimais++;
                view.exibirMensagem("Animal adicionado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            view.exibirMensagem("O zoológico está lotado!", "Zoológico Cheio", JOptionPane.WARNING_MESSAGE);
        }
    }

    // Método privado para a lógica de listar os animais
    private void listarAnimais() {

        view.listarAnimais(listaDeAnimais, totalDeAnimais);
    }

    // Método privado para a lógica de ouvir o som de um animal
    private void ouvirSomAnimal() {
        int id = view.obterIdAnimal();
        if (id == -1) return;

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