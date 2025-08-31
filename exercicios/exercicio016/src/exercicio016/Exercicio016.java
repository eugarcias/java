/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio016;
// Implemente uma calculadora,
// primeiro peça 2 números ao usuário (um de cada vez)
// e apresente as seguintes opções:
// adição
// subtração
// Mostre o resultado após a operação.

// (JAVA) EXERCÍCIO 16
// PROGRAMAÇÃO DE SOLUÇÕES
// COMPUTACIONAIS
// multiplicação
// divisão
import javax.swing.JOptionPane;

public class Exercicio016 {

    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Insira um número:"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira outro número:"));

        int operacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a operação:\n"
                + "1 - Adição\n"
                + "2 - Subtração\n"
                + "3 - Multiplicação\n"
                + "4 - Divisão"));

        double resultado = 0;
        String mensagem = "";

        switch (operacao) {
            case 1: // Adição
                resultado = num1 + num2;
                mensagem = "O resutado da adição é: " + resultado;
                break; // Break utilizado para sair do Swicht e encerrar o programa.

            case 2: //Subtração
                resultado = num1 - num2;
                mensagem = "O resultado da subtração é " + resultado;
                break;

            case 3: // Multiplicação 
                resultado = num1 * num2;
                mensagem = "O resultado da multiplicação é: " + resultado;
                break;

            case 4: // Divisão

                if (num2 != 0) {
                    resultado = num1 / num2;
                    mensagem = "O resultado da divisão é: " + resultado;
                } else {
                    mensagem = "Erro: não é possivel dividir por zero";
                }
                break;
                
            default: 
                mensagem = "Opção Inválida.";
                break;
        }
        
        JOptionPane.showMessageDialog(null, mensagem);

    }

}
