/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio018;

//
//categoria de cada produto.
//Uma loja dará um desconto em seus produtos de acordo com a
//As categorias e os descontos são mostrados abaixo:


//A = 10% B = 15% C = 20% E = 25% E = 50%

//Faça um algoritmo para ler o nome do cliente, o preço e a categoria do produto que o
//cliente está comprando. Após a leitura mostrar na tela o preço final que cliente deverá
//pagar após ter sido dado o desconto no preço da mercadoria.

import javax.swing.JOptionPane;
public class Exercicio018 {

    
    public static void main(String[] args) {
        
        String Nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
        Float precoproduto = Float.parseFloat(JOptionPane.showInputDialog("Qual preço do produto: R$"));
        String categoriaString = JOptionPane.showInputDialog("Digite a categoria do produto (A, B, C, D, E): ");
        char categoria = categoriaString.toUpperCase().charAt(0);
        
        Double percentualDesconto = 0.0;
        String categoriaNome = "";
        
        switch (categoria){
            case 'A':
                percentualDesconto = 0.10;
                categoriaNome = "A - 10%";
                break;
                
            case 'B':
                percentualDesconto = 0.15;
                categoriaNome = "B - 15%";
                break;
                
            case 'C':
                percentualDesconto = 0.20;
                categoriaNome = "C - 20%";
                break;
                
            case 'D':
                percentualDesconto = 0.25;
                categoriaNome = "D - 25%";
                break;
                
            case 'E':
                percentualDesconto = 0.50;
                categoriaNome = "E - 50%";
                break;
            
            default:
                categoriaNome = "Categoria Inválida";
                break;
        }
        double valorDesconto = precoproduto * percentualDesconto;
        double precofinal = precoproduto - valorDesconto;
        
        String mensagem = "Resumo da Compra\n"
                + "Cliente: " + Nome + "\n"
                + "Preço Original: R$ " + String.format ("%.2f", precoproduto) + "\n"
                + "Categoria: " + categoriaNome + "\n"
                + "Valor do Desconto: R$ " + String.format("%.2f", valorDesconto) + "\n"
                + "-------------------------\n"
                + "Preço Final: R$ " + String.format("%.2f", precofinal);
        
        JOptionPane.showMessageDialog(null, mensagem);
        
    }
    
}
