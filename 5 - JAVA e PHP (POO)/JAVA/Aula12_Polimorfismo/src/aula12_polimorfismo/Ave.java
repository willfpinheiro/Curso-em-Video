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
public class Ave extends Animal{
    //Atributo
    private String corPena;
    
    //Getter and Setter

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    //Métodos
     @Override
    public void exibirAnimal() {
         System.out.println("============ Ave ========");
         System.out.println("Peso: "+this.getPeso());
         System.out.println("Idade: "+this.getIdade());
         System.out.println("Membros: "+this.getMembros());
         System.out.println("Cor da pena: "+this.getCorPena());
    }
    
    @Override
    public void locomover() {
        System.out.println("Voando ...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo fruta ...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de passáro.");
    }
    
    public void fazerNinho(){
        System.out.println("Fazendo um ninho ...");
    }

   
    
    
}
