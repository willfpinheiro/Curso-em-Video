/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_exerciciopratico;

/**
 *
 * @author ronan
 */
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
    //Construtor
    public Pessoa(String nome,int idade,char sexo){
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
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
    
    //Métodos Específicos
    
    public void apresentar(){
        System.out.println("---------- Apresentação -------------");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade()+" anos");
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("-------------------------------------");
    }
    
    public void fazerAniverssario(){
        this.setIdade(this.getIdade() + 1);
        System.out.println("Parabéns! Você agora têm "+this.getIdade()+" anos.");
    }
    
}
