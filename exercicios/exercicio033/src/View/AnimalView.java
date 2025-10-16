
package View;

import Model.Animal;
import Model.Gato;
import Model.Cachorro;
import Model.Galinha;

import javax.swing.JOptionPane;
import java.util.List;

public class AnimalView {
    public int menu(){
        String menuTexto = "---ZOOLÓGICO --- \n" +
                "1 - Adicionar Animal\n" +
                "2 - Listar Animal\n"+
                "3 - Fazer um Animal emitir som\n"+
                "4 - Sair\n\n"+
                "Escolha uma opção";

        try {
            String opcStr = JOptionPane.showInputDialog(null, menuTexto, "Menu Principal", JOptionPane.QUESTION_MESSAGE);

            if (opcStr == null){
                return 0;
            }

            return Integer.parseInt(opcStr);
    } catch (NumberFormatException e) {
            exibirMensagem ("Erro: Por favor, digite um número válido", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
            return -1;
        }


}
}