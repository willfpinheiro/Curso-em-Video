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
public class Peixe extends Animal{
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
        System.out.println("============= Peixe ==============");
        System.out.println("Peso: "+this.getPeso());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Membros: "+this.getMembros());
        System.out.println("Cor da escama: "+this.getCorEscama());
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadando ...");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo organismos ...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não emite som .");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando uma bolha ...");
    }

    
    
}
