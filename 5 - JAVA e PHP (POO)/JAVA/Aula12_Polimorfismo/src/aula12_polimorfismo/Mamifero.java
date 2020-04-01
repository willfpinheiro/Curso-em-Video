/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula12_polimorfismo;

/**
 *
 * @author ronan
 */
public class Mamifero extends Animal{
    //Atributo
    private String corPelo;
    
    //Getter and Setter

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //Métodos
    
    @Override
    public void exibirAnimal() {
        System.out.println("========= Mamífero ===========");
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Membros: "+this.getMembros());
        System.out.println("Cor da Pele: "+this.getCorPelo());
    }
    
    @Override
    public void locomover() {
        System.out.println("Correndo ...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo carne ...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero .");
    }

    
    
}
