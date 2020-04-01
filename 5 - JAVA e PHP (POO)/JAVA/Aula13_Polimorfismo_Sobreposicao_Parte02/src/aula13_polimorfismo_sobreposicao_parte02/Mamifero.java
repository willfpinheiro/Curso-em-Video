/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula13_polimorfismo_sobreposicao_parte02;

/**
 *
 * @author ronan
 */
public  class Mamifero extends Animal{
    @Override //Sobreposição
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }
    
    public void apresentar(){
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Membros: "+this.getMembros());
    }
}
