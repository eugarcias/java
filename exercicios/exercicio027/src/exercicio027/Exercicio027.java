
package exercicio027;


import Model.Aluno;
import javax.swing.JOptionPane;

public class Exercicio027 {

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
       int matricula = Integer.parseInt(JOptionPane.showInputDialog("Qual a matricula do aluno? "));
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade?"));
       boolean mensalidade = JOptionPane.showConfirmDialog(null,"Mensalidade está em dia?", "Mensalidade", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
       
       Aluno aluno1 = new Aluno(matricula, nome, idade, mensalidade);
       
       String mensagem = "Aluno criado com sucesso\n" +
               "Nome: " + aluno1.getNome() + "\n" +
               "Matricula: " + aluno1.getMatricula() + "\n" +
               "Idade: " + aluno1.getIdade() + "\n" +
               "Mensalidade em dia? " + (aluno1.isMensalidade() ? "Sim" : "Não");
       
       JOptionPane.showMessageDialog(null, mensagem);
       
       aluno1.setMensalidade(false);
       
       String novaMensagem = "O Status da mensalidade foi alterado!\n" +
               "A mensalidade de " + aluno1.getNome() + " está agora: " + (aluno1.isMensalidade()? "Em dia" : "Atrasada");
        
       JOptionPane.showMessageDialog(null, novaMensagem);
               
        
    }
    
}
