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
public class Aula06_Encapsulamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância
        ControleRemoto con = new ControleRemoto();
        
        con.ligar();
        con.diminuirVolume();
        con.ligarMudo();
        con.desligarMudo();
        con.pause();
        con.play();
        con.desligar();
        con.abrirMenu();
        
    }
    
}
