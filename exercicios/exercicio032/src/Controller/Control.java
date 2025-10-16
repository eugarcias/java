package Controller;

import Model.*;
import View.AppView;
import javax.swing.*;

public class Control {
    private AppView view;

    public Control(AppView view){
        this.view = view;
    }
    public void iniciar() {
        int opcao;
        do {
            opcao = view.exibirMenu();

            switch (opcao){
                case 1:
                    criarAluno();
                    break;
                case 2:
                    criarProfessor();
                    break;
                case 3:
                    criarFuncionario();
                    break;
                case 0:
                    view.exibirMensagem("saindo do programa...", "Finalizado", JOptionPane.INFORMATION_MESSAGE);
                    break;
                default:
                    if (opcao != -1) {
                        view.exibirMensagem("Opção Inválida!", "Erro", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
            }
        } while (opcao !=0);
    }


        private void criarAluno() {
            String nome = view.solicitarDado("Digite o nome do aluno:");
            String idStr = view.solicitarDado("Digite o ID do aluno:");
            String idadeStr = view.solicitarDado("Digite a idade do Aluno:");
            String matricula = view.solicitarDado("Digite a matricula do Aluno:");
            String curso = view.solicitarDado("Digite o curso do Aluno");

            int id = Integer.parseInt(idStr);
            int idade = Integer.parseInt(idadeStr);
            Aluno aluno = new Aluno(id, nome, idade, matricula, curso);

            view.exibirMensagem(aluno.toString(), "Aluno Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        }

        private void criarProfessor(){
        String idStr = view.solicitarDado("Digite o ID do Professor:");
            String nome = view.solicitarDado("Digite o nome do professor:");
            String idadeStr = view.solicitarDado("Digite a idade do professor:");
            String salarioStr = view.solicitarDado("Digite o salario do professor:");
            String disciplina = view.solicitarDado("Digite a disciplina do professor:");

            int id = Integer.parseInt(idStr);
            int idade = Integer.parseInt(idadeStr);
            double salario = Double.parseDouble(salarioStr);

            Professor professor = new Professor(id, nome, idade, salario, disciplina);
            view.exibirMensagem(professor.toString(), "Professor Cadastrado", JOptionPane.INFORMATION_MESSAGE);
        }

        private void criarFuncionario (){
        String idStr = view.solicitarDado("Digite o ID do Funcionario:");
            String nome = view.solicitarDado("Digite o nome do funcionário:");
            String idadeStr = view.solicitarDado("Digite a idade do funcionário");
            String cargo = view.solicitarDado("Digite o cargo do funcionário");
            String salarioStr = view.solicitarDado("Digite o salário do funcionário");

            double salario = Double.parseDouble(salarioStr);
            int idade = Integer.parseInt(idadeStr);
            int id = Integer.parseInt(idStr);

            Funcionario funcionario = new Funcionario(id,nome,idade, cargo, salario);
            view.exibirMensagem(funcionario.toString(),"Funcionário Cadastrado", JOptionPane.INFORMATION_MESSAGE);

        }



}
