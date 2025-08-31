/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio015;

//Solicitar nome e idade de uma pessoa.
//Se a pessoa possuir idade entre 15 e 25 anos, imprimir o nome e a
//mensagem: “ACEITA”.
//Caso contrário, imprimir o nome e a mensagem: “NÃO ACEITA”.
import javax.swing.JOptionPane;

public class Exercicio015 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome:");

        int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?"));
        if (idade >= 15 && idade <= 25) {
            JOptionPane.showMessageDialog(null, "Nome:" + nome + "\nStatus: ACEITA");
        } else {
            JOptionPane.showMessageDialog(null, "Nome:" + nome + "\nStatus: NÃO ACEITA");
        }
    }

}
