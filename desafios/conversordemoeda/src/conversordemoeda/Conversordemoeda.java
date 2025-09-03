/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversordemoeda;

/**
 *
 * @author Mauricio
 */
import javax.swing.JOptionPane;

public class Conversordemoeda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        
        float valorEmReais = Float.parseFloat(JOptionPane.showInputDialog("Seja bem-vindo ao conversor de moeda!\n \n " + "Qual valor deseja converter em R$? "));
        
        String moedaEscolhida = JOptionPane.showInputDialog("Selecione a moeda de destino:\n" 
                + "D - Dólar (US$ 1 = r$5,20)\n" 
                + "E -  Euro (€ 1 = R$ 5,60)\n"
                + "L - Libra Esterlina (£ 1 = R$ 6,50)\n") .toUpperCase();
        
        double valorConvertido = 0.0;
        String nomeMoeda = "";
        
        switch (moedaEscolhida){
            case "D":
                valorConvertido = valorEmReais / 5.20;
                nomeMoeda = "Dólar";
                break;
            case "E":
                valorConvertido = valorEmReais / 5.60;
                nomeMoeda = "Euro";
                break;
            case "L":
                valorConvertido = valorEmReais / 6.50;
                nomeMoeda = "Libra";
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "Opção Inválida");
                return;
        } JOptionPane.showMessageDialog(null,
                String.format("Valor em Reais: R$ %.2f\n", valorEmReais) +
                String.format("Valor convertido para %s: %.2f", nomeMoeda, valorConvertido));
        
        
    }

}
