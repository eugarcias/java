/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio13;

/**
 * A prefeitura de Florianópolis abriu uma linha de crédito para os funcionários
 * estatutários. O valor máximo da prestação não poderá ultrapassar 30% do
 * salário bruto. Faça um algoritmo que permita entrar com o salário bruto e o
 * valor da prestação e informar se o empréstimo pode ou não ser concedido.
 */
import javax.swing.JOptionPane;

public class Exercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        float salario = Float.parseFloat(JOptionPane.showInputDialog("Qual seu sálario? "));
        float prestacao = Float.parseFloat(JOptionPane.showInputDialog("Qual valor da prestação? "));

        float limite = (salario * 0.3f);

        if (prestacao <= limite) {
            JOptionPane.showMessageDialog(null, "Empréstimo pode ser concedido!\n" + "Limite permitido: R$" + limite);

        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo não pode ser concedido!\n" + "Limite permitido: R$ " + limite);
        }
    }
}
