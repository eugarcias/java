/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Principal;

/**
 *
 * @author Mauricio
 */
import javax.swing.JOptionPane;

public class Principal {

    // Faça um programa em JAVA que solicite 2 números inteiros e efetue
    // a adição; caso o resultado seja maior que 10, apresentá-lo:
    public static void main(String[] args) {

        int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número:"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira outro número:"));

        int soma = numero1 + numero2;
        
        if (soma > 10) {
        JOptionPane.showMessageDialog(null,"A soma dos número é:" + soma);
        } else {
                JOptionPane.showMessageDialog(null,"A soma dos números é inferior a 10! ");
                } 
        
    }
}
