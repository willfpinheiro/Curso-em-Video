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
public class Aula13_Polimorfismo_Sobreposicao_Parte02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        
        mamifero.setIdade(2);
        mamifero.setPeso(6.5f);
        mamifero.setMembros(4);
        mamifero.emitirSom();
        mamifero.apresentar();
        
        System.out.println("-------- Lobo -----------");
        Lobo lobo = new Lobo();
        
        lobo.setIdade(12);
        lobo.setPeso(15.7f);
        lobo.setMembros(4);
        lobo.apresentar();
        lobo.emitirSom();
        
        System.out.println("------- Cachorro -------");
        Cachorro cao = new Cachorro();
        
        cao.setIdade(6);
        cao.setPeso(9);
        cao.setMembros(4);
        cao.apresentar();
        
        cao.reagir("Venha cá"); //frase
        cao.reagir(17);         //hora    
        cao.reagir(false);      //dono
        cao.reagir();        //idade e peso
        
    }
    
}
