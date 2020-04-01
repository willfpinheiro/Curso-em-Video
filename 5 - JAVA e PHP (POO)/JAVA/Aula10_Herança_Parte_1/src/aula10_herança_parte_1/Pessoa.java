/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_herança_parte_1;

/**
 *
 * @author ronan
 */
public class Pessoa {
    //Atributos
    private String nome;
    private int idade;
    private char sexo;
    
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
    
    
    //Método Específico
    
    public void apresentar(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade()+" anos");
        String tipoSexo = this.getSexo() == 'm'? "masculino" : this.getSexo() == 'f' ? "feminino" : "Não especificado";
        System.out.println("Sexo: "+tipoSexo);
    }
    
    public void fazerAniverssario(){
        this.setIdade(this.getIdade() + 1);
    }
    
}
