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
public class Cachorro extends Lobo{
    @Override //Sobreposição
    public void emitirSom(){
        System.out.println("Au Au Au Au");
    }
    
    public void reagir(String frase){
        if(frase == "Olá" || frase == "Venha cá"){
            System.out.println("Abanar rabo e latir"); 
        }else{
            System.out.println("Rosnar");
        }
    }
    
    public void reagir(int hora){
        if(hora <= 5){
            System.out.println("Dormindo");
        }else if(hora <= 12){
            System.out.println("Abanar rabo");
        }else if(hora >= 18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar rabo e latir");
        }
    }
    
    public void reagir(boolean dono){
        if(dono){
            System.out.println("Abanar rabo");
        }else{
            System.out.println("Rosnar e latir");
        }
    }
    
    public void reagir(){
        if(this.getIdade() <= 5){
            if(this.getPeso() <= 8){
                System.out.println("Abanar rabo");
            }else{
                System.out.println("Latir");
            }    
        }else{
            if(this.getPeso() <= 8){
                System.out.println("Rosnar");
            }else{    
                System.out.println("Ignorar");
            }    
        }
    }
    
    
}
