/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class Aluno {
    
    private int matricula;
    private String nome;
    private String descricaosaude;
    private float altura;
    private double peso;
    
    public Aluno (){
        
    }
    public Aluno (int matricula, String nome, String descricaosaude, float altura, double peso){
        this.matricula = matricula;
        this.nome = nome;
        this.descricaosaude = descricaosaude;
        this.altura = altura;
        this.peso = peso;
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

    public String getDescricaosaude() {
        return descricaosaude;
    }

    public void setDescricaosaude(String descricaosaude) {
        this.descricaosaude = descricaosaude;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
