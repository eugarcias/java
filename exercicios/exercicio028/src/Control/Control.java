package Control;


import javax.swing.JOptionPane;
import Model.Aluno;
import Model.Pessoa;
import Model.Professor;

public class Control {


    public static void main (String[] args){



int idAluno = Integer.parseInt(JOptionPane.showInputDialog("Aluno, insira seu ID: "));
String nomeAluno = JOptionPane.showInputDialog("Insira o seu nome: ");
int idadeAluno =  Integer.parseInt(JOptionPane.showInputDialog("Insira sua idade: "));
String cursoAluno = JOptionPane.showInputDialog("Insira o seu curso: ");
int faseAluno = Integer.parseInt(JOptionPane.showInputDialog("Qual a fase do seu curso? "));

Aluno aluno1 = new Aluno(idAluno, nomeAluno, idadeAluno, cursoAluno, faseAluno);

        String mensagemAluno = "Aluno criado com sucesso!" + "\n" +
    "ID Aluno: " + aluno1.getId () + "\n" +
    "Nome: " + aluno1.getNome  () + "\n" +
    "Idade: " + aluno1.getIdade () + "\n" +
    "Curso: " + aluno1.getCurso() + "\n" +
    "Fase: " + aluno1.getFase();

        JOptionPane.showMessageDialog(null, mensagemAluno);


    }
}

