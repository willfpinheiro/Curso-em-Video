/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula06_encapsulamento;

/**
 *
 * @author ronan
 */
public class ControleRemoto implements Controlador{
    //Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    //Construtor
    public ControleRemoto(){
        this.setVolume(50);
        this.setTocando(true);
        this.setLigado(false);
    }
    
    //Getters and Setters 

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    
    //Métodos Específicos
    @Override
    public void ligar() {
        System.out.println("Ligando ...");
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando...");
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if(this.isLigado()){
            System.out.println("------------------------------------");
            System.out.println("                MENU                ");
            System.out.print("Volume: "+this.getVolume()+" ");
            for(int cont = 0 ;cont < this.getVolume();cont += 10){
                System.out.print("|");
            }
            System.out.println("");
            System.out.println("Estado: "+this.isLigado());
            System.out.println("Reprodução:"+this.isTocando());
            System.out.println("------------------------------------");
        }else{
            System.out.println("Impossível abrir menu.A TV está desligada.");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando Menu ...");
    }

    @Override
    public void aumentarVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() + 10);
        }else{
            System.out.println("Impossível aumentar volume.Porque a TV está desligada.");
        }
    }

    @Override
    public void diminuirVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 10);
        }else{
            System.out.println("Impossível diminuir volume.Porque a TV está desligada.");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.isLigado() && (this.getVolume() != 0)){
            this.setVolume(0);
        }else{
            System.out.println("Impossível ligar o mudo.A TV está desligada ou já estava no mudo.");
        }
    }

    @Override
    public void desligarMudo() {
        if(this.isLigado() && (this.getVolume() == 0) ){
            this.setVolume(50);
        }else{
            System.out.println("Impossível desligar o mudo.A TV está desligada ou já estava desligado o mudo.");
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && (this.isTocando() != true)){
            this.setTocando(true);
        }else{
            System.out.println("Impossível reproduzir.A TV está desligada ou já estava executando.");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && (this.isTocando() == true)){
            this.setTocando(false);
        }else{
                System.out.println("Impossível pausar a programação.Porque a TV está desligada ou já estava no pause.");
        }
    }
    
}
