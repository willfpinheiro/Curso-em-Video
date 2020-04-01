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
public class Cachorro extends Mamifero{
    //Métodos 
    @Override
    public void exibirAnimal(){
        System.out.println("---------- Cachorro -----------");
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Membros: "+this.getMembros());
        System.out.println("Cor da Pele: "+this.getCorPelo());
    }
    
    public void enterrarOsso(){
        System.out.println("Enterrando o osso ...");
    }
    
    public void abanarRabo(){
        System.out.println("Abanando o rabo ...");
    }
    
}
