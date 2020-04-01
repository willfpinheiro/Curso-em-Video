/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_e_aula08.ultimateemojicombat.relacionamentoentreclasses;

import java.util.Random;

/**
 *
 * @author ronan
 */
public class Luta{
    //Atributos
    private Lutador desafiado;  //Tipo abstrato
    private Lutador desafiante; //Tipo abstrato
    private int rounds;
    private boolean aprovada;
    
    //Getters and Setters
   
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    //Métodos Específicos

    public void marcarLuta(Lutador l1,Lutador l2) {
        //Verificar se a categoria entra os lutadores é a mesma
        //e são lutadores diferentes
        if(l1.getCategoria() == l2.getCategoria() && (l1 != l2 ) ){
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        }else{
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }    
    }
    
    public void lutar(){
        if(this.isAprovada()){
            System.out.println("######## Desafiado ########");
           this.getDesafiado().apresentar();
            System.out.println("####### Desafiante ########");
           this.getDesafiante().apresentar();
           
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3); // 0 1 2
           
            System.out.println("================= Resultado da luta ==============");
           switch(vencedor){
               case 0: //Empate
                   System.out.println("Empatou!");
                   this.getDesafiado().empatarLuta();
                   this.getDesafiante().empatarLuta();
                   break;
               case 1: //Desafiado ganhou
                   System.out.println(this.getDesafiado().getNome()+" ganhou !");
                   this.getDesafiado().ganharLuta();
                   this.getDesafiante().perderLuta();
                   break;
               case 2: //Desafiante ganhou
                   System.out.println(this.getDesafiante().getNome()+" ganhou !");
                   this.getDesafiante().ganharLuta();
                   this.getDesafiado().perderLuta();
                   break;
           }
            System.out.println("================================================");
        }else{
            System.out.println("Luta não aprovada.");
        }
    }


    
    
}
