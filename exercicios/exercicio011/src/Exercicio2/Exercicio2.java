/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Exercicio2;

import javax.swing.JOptionPane;
public class Exercicio2 {

  //Faça um programa em JAVA que solicite 1 número inteiro, verificar
  //se o mesmo é múltiplo de 2 e mostrar a resposta mesmo que negativa
    
    public static void main(String[] args) {
        
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número: "));
        
        if ( (numero % 2) == 0){
           JOptionPane.showMessageDialog(null, "É Multiplo de 2!");
        } else{
            JOptionPane.showMessageDialog(null, "Não, é multiplo de 2!");
        }
        
    }
    
}
