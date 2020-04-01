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
public class Tartaruga extends Reptil{
    @Override
    public void exibirAnimal(){
        System.out.println("---------- Tartaruga -----------");
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Membros: "+this.getMembros());
        System.out.println("Cor da Escama: "+this.getCorEscama());
    }
    
    @Override
    public void locomover(){
        System.out.println("Andando beeeeeem devagar ...");
    }
}
