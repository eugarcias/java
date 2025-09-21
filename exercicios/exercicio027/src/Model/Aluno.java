/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Model.Pessoa;


public class Aluno extends Pessoa {
    
    private int id;
    private String nome;
    private int idade;
    private boolean mensalidade;
    

    public Aluno (){
        
    }
    public Aluno (int id, String nome, int idade, boolean mensalidade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.mensalidade = mensalidade;
        
    }

    public int getId() {
        return id;
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
    

    