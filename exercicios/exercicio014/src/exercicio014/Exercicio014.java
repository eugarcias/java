/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio014;

//Solicitar o ano de nascimento de uma pessoa e o ano atual. Verifique
//se o ano de nascimento é válido, ou seja, se o ano de nascimento é
//menor que o ano atual, então mostre a idade desta pessoa.

import javax.swing.JOptionPane;

public class Exercicio014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        

        int anonasc = Integer.parseInt(JOptionPane.showInputDialog("Qual seu ano de nascimento? "));

        int anoatual = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano atual? "));

        if (anonasc < anoatual) {

            int idade = (anoatual - anonasc);
            JOptionPane.showMessageDialog(null, "Sua idade é! " + idade + "anos.");
        } else {
            JOptionPane.showMessageDialog(null, "O ano de nascimento não pode ser maior ou igual ao ano atual!");
        }
    }
}

