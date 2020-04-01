/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube_parte_02;

/**
 *
 * @author ronan
 */
public abstract class Pessoa {
    //Atributos
    protected String nome;
    protected int idade;
    protected char sexo;
    protected int experiencia;
    
    //Construtor
    public Pessoa(String nome,int idade,char sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setExperiencia(0);
    }
    
    //Getters and Setters

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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    //Método Abstrato
    protected abstract void ganharExperiencia();
    protected abstract void apresentarGafanhoto();
}
