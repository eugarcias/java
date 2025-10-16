package main;

import Controller.AnimalController;

public class Main {
    public static void main(String[] args) {
        // Cria o cérebro do sistema
        AnimalController controller = new AnimalController();

        // Inicia o programa
        controller.iniciar();
    }
}