package Exercicios012;

import javax.swing.JOptionPane;

/**
 *
 * @author MauricioGarcia
 */
public class Exercicios012 {

    //Faça um programa em JAVA que solicite 2 números inteiros, verificar qual é
    //o número maior e mostrar na tela, ou se forem iguais, mostrar uma
    //mensagem indicando esta informação.
    public static void main(String[] args) {
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro número:"));
        if (numero1 > numero2) {
            JOptionPane.showMessageDialog(null, numero1 + " é maior que " + numero2);
        } else if (numero2 > numero1) {
            JOptionPane.showMessageDialog(null, numero2 + " é maior que " + numero1);
        } else {
            JOptionPane.showMessageDialog(null, "Os dois números são iguais!");
        }

    }
}
