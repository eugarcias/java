package exercicio0005;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Exercicio0005 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da sua matricula!"));

        Aluno aluno = new Aluno(nome, matricula);

        String inputNota;

        do {
            inputNota = JOptionPane.showInputDialog("Digite uma nota (ou 'fim' para terminar):");

            if (inputNota == null || inputNota.equalsIgnoreCase("fim")) {
                break;
            }

            // Bloco try-catch movido para dentro do do-while
            try {
                // Usando Double.parseDouble para consistência
                double nota = Double.parseDouble(inputNota);
                aluno.adicionarNota(nota);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Digite um número válido.");
            }
        } while (true);

        double media = aluno.calcularMedia();
        boolean aprovado = aluno.verificarAprovacao();

        String mensagem = "Resumo do aluno:\n";
        // Corrigido para exibir o nome, não a matrícula
        mensagem += "Nome: " + aluno.getNome() + "\n";
        mensagem += "Matricula: " + aluno.getMatricula() + "\n";
        mensagem += String.format("Média: %.2f\n", media);
        mensagem += "Status: " + (aprovado ? "Aprovado" : "Reprovado");

        JOptionPane.showMessageDialog(null, mensagem);
    }
}