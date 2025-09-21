package Control;

import Model.Aluno;
import Model.Funcionario;

import javax.swing.*;



import Model.Aluno;
import Model.Funcionario;
import javax.swing.JOptionPane;

public class Control {

    /**
     Usando como base a aula anterior, crie um exemplo de classe Aluno para
     uma academia de ginástica. Siga os passos:


     Analise o contexto de uma academia de ginástica e faça as
     abstrações necessárias para obter os atributos principais;
     Crie a estrutura de pacotes MVC e dentro da camada Model crie seu exemplo;
     Adicione os atributos e métodos GET e SET ao seu exemplo;
     Adicione os Construtores desta classe;
     *
     Na Classe principal (main class) instancie objetos da classe Aluno e
     demonstre o uso dos construtores e métodos de acesso;
     *
     *
     */
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Qual nome do aluno?");
        int idAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual o ID do aluno? "));
        int idadeAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?"));
        boolean mensalidadeAluno = JOptionPane.showConfirmDialog(null,"Mensalidade está em dia?", "Mensalidade", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;

        Aluno aluno1 = new Aluno(idAluno, nome, idadeAluno, mensalidadeAluno);

        String mensagemAluno = "Aluno criado com sucesso\n" +
                "Nome: " + aluno1.getNome() + "\n" +
                "ID: " + aluno1.getId() + "\n" +
                "Idade: " + aluno1.getIdade() + "\n" +
                "Mensalidade em dia? " + (aluno1.isMensalidade() ? "Sim" : "Não");

        JOptionPane.showMessageDialog(null, mensagemAluno);

        aluno1.setMensalidade(false);

        String novaMensagem = "O Status da mensalidade foi alterado!\n" +
                "A mensalidade de " + aluno1.getNome() + " está agora: " + (aluno1.isMensalidade()? "Em dia" : "Atrasada");

        JOptionPane.showMessageDialog(null, novaMensagem);

        int idFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ID de Funcionário: "));
        String nomeFuncionario = JOptionPane.showInputDialog("Qual seu nome? ");
        int idadeFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
        String cargo = JOptionPane.showInputDialog("Qual seu cargo? ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salario?"));

        Funcionario funcionario1 = new Funcionario(idFuncionario, nomeFuncionario, idadeFuncionario, cargo, salario);


        String mensagemFuncionario = "Funcionario criado com sucesso!\n" +
                "Id: " + funcionario1.getId() + "\n" +
                "Nome: " + funcionario1.getNome() + "\n" +
                "Idade: " + funcionario1.getIdade() + "\n" +
                "Cargo: " + funcionario1.getCargo() + "\n" +
                "Salario:  " + funcionario1.getSalario();

        JOptionPane.showMessageDialog(null, mensagemFuncionario);



    }

}
