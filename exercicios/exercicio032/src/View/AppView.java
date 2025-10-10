package View;
import javax.swing.JOptionPane;
public class AppView {

    public int exibirMenu (){
        try {
            String opcaoStr = JOptionPane.showInputDialog(null,
                    "Escolha o tipo de Cadastro: \n\n" +
                    "1 - Aluno\n" +
                    "2 - Professor\n" +
                    "3 - Funcionário\n" +
                    "0 - Sair", "Menu de Cadastro",
                    JOptionPane.QUESTION_MESSAGE);

            if (opcaoStr == null) {
                return 0;
            }

            return Integer.parseInt(opcaoStr);
        } catch (NumberFormatException erro) {
            exibirMensagem("Erro: Por favor digite um número válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
            return -1;

        }
    }
    public String solicitarDado(String mensagem){
        return JOptionPane.showInputDialog(null, mensagem, "Entrada de Dados,", JOptionPane.PLAIN_MESSAGE);
    }
    public void exibirMensagem (String mensagem, String titulo, int tipoDeMensagem){
        JOptionPane.showMessageDialog(null, mensagem, titulo, tipoDeMensagem);
    }
}
