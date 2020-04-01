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
public class Aula12_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mamífero
        Mamifero mamifero = new Mamifero();
        
        mamifero.setPeso(8.0f);
        mamifero.setIdade(8);
        mamifero.setMembros(4);
        mamifero.setCorPelo("Branco");
        mamifero.exibirAnimal();
        mamifero.locomover();
        mamifero.alimentar();
        mamifero.emitirSom();
        
        //Reptil
        Reptil reptil = new Reptil();
        
        reptil.setPeso(0.5f);
        reptil.setIdade(2);
        reptil.setMembros(4);
        reptil.setCorEscama("Verde");
        reptil.exibirAnimal();
        reptil.locomover();
        reptil.alimentar();
        reptil.emitirSom();
        
        //Peixe
        Peixe peixe = new Peixe();
        
        peixe.setPeso(1.0f);
        peixe.setIdade(5);
        peixe.setMembros(0);
        peixe.setCorEscama("Cinza");
        peixe.exibirAnimal();
        peixe.locomover();
        peixe.alimentar();
        peixe.emitirSom();
        peixe.soltarBolha();
        
        //Ave
        Ave ave = new Ave();
        
        ave.setPeso(0.500f);
        ave.setIdade(7);
        ave.setMembros(2);
        ave.setCorPena("Vermelha");
        ave.exibirAnimal();
        ave.locomover();
        ave.alimentar();
        ave.emitirSom();
        ave.fazerNinho();
        
        //Canguru
        Canguru canguru = new Canguru();
        
        canguru.setPeso(10.0f);
        canguru.setIdade(12);
        canguru.setMembros(4);
        canguru.setCorPelo("Marrom");
        canguru.exibirAnimal();
        canguru.locomover();
        canguru.usarBolsa();
        
        //Cachorro
        Cachorro cao = new Cachorro();
        
        cao.setPeso(5);
        cao.setIdade(7);
        cao.setMembros(4);
        cao.setCorPelo("Amarelo");
        cao.exibirAnimal();
        
        //Tartaruga
        Tartaruga tartaruga = new Tartaruga();
        
        tartaruga.setPeso(2.0f);
        tartaruga.setIdade(20);
        tartaruga.setMembros(4);
        tartaruga.setCorEscama("Verde");
        tartaruga.exibirAnimal();
        tartaruga.locomover();
        
        //Cobra
        Cobra cobra = new Cobra();
        
        cobra.setPeso(0.8f);
        cobra.setIdade(10);
        cobra.setMembros(0);
        cobra.setCorEscama("Preta");
        cobra.exibirAnimal();
        cobra.locomover();
        cobra.alimentar();
        cobra.emitirSom();
        
    }
    
}
