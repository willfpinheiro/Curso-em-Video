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
public class Reptil extends Animal{
    //Atributo
    private String corEscama;
    
    //Getter and Setter

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    //Métodos
    
    @Override
    public void exibirAnimal() {
        System.out.println("========== Réptil ==========");
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Membros: "+this.getMembros());
        System.out.println("Cor da escama: "+this.getCorEscama());
    }
    
    @Override
    public void locomover() {
        System.out.println("Arrastando ...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetal ...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil.");
    }

    
    
}
