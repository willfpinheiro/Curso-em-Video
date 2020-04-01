/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03_visibilidade;

/**
 *
 * @author ronan
 */
public class Caneta {
    //Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    
    //Métodos
    public void status(){
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Carga: "+this.carga+"%");
        System.out.println("Está tampada ? "+this.tampada);
    }
    
    public void escrever(){
        if(this.tampada == true){
            System.out.println("Erro! Não pode escrever.");
        }else{
            System.out.println("Estou escrevendo ...");
        }
    }
    
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("Erro! Não pode rabiscar.");
        }else{
            System.out.println("Estou rabiscando ...");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }

    protected void destampar(){
        this.tampada = false;
    }
    
}
