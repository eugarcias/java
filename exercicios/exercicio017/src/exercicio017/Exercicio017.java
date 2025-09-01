/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio017;

//Implemente um algoritmo em JAVA que escreva a seguinte mensagem na tela,
//substituindo a profissão pela informada pelo usuário:
//"Tibúrcio é <profissão>"
//Solicite ao usuário que informe a profissão do Tibúrcio, apresente as seguintes

///opções: (JAVA) EXERCÍCIO 17

//PROGRAMAÇÃO DE SOLUÇÕES
//COMPUTACIONAIS

//Se informada opção diferente das apresentadas a profissão é DESEMPREGADO.
import javax.swing.JOptionPane; 

public class Exercicio017 {

    
    public static void main(String[] args) {
        
        String profissao;
        
        String opcao = JOptionPane.showInputDialog("Qual a profissão de Tiburcio?\n" 
                + "A - Advogado\n"
                + "D - Designer\n"
                + "E - Engenheiro\n"
                + "M - Médico\n"
                + "P - Programador\n").toUpperCase();
        
        switch (opcao) {
            case "P": 
                profissao = "Programador";
                break;
            
            case "E":
                profissao = "Engenheiro";
                break;
            
            case "M":
                profissao = "Médico";
                break;
            case "A":
                profissao = "Advogado";
                break;
                
            case "D":
                profissao = "Designer";
                break;
                
            default:
                profissao = "Desempregado!";
                break;
        }
        JOptionPane.showMessageDialog(null,"Tibúrcio é " + profissao);
    } 
    
}
