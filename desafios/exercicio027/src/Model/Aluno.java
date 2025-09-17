/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Aluno {
    
    private int matricula;
    private String nome;
    private int idade;
    private boolean mensalidade;
    

    public Aluno (){
        
    }
    public Aluno (int matricula, String nome, int idade, boolean mensalidade){
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.mensalidade = mensalidade;
        
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(boolean mensalidade) {
        this.mensalidade = mensalidade;
    }

    
}
    

    