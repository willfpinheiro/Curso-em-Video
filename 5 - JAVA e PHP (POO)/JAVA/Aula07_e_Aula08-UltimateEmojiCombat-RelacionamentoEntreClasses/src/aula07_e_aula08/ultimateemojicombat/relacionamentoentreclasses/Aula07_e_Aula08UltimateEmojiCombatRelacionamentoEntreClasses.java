/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula07_e_aula08.ultimateemojicombat.relacionamentoentreclasses;

/**
 *
 * @author ronan
 */
public class Aula07_e_Aula08UltimateEmojiCombatRelacionamentoEntreClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância do Lutador
        Lutador L[] = new Lutador[6];
        
        L[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,2,1);
        
             //L[0].apresentar();
        
        L[1] = new Lutador("Putscript","Brasil",29,1.68f,57.8f,14,2,3);
        
             //L[1].apresentar();
             
        L[2] = new Lutador("Snapshadow","Eua",35,1.65f,80.9f,14,2,3);
        
            //L[2].apresentar();
        
        L[3] = new Lutador("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        
            //L[3].apresentar();
            
        L[4] = new Lutador("UfoCobol","Brasil",37,1.70f,119.3f,5,4,3);
            
           // L[4].ganharLuta();
           // L[4].apresentar();
           //L[4].status();
        
        L[5] = new Lutador("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);
        
            //L[5].apresentar();
            
            
        //Instância da Luta
        Luta UEC_01 = new Luta();
        
        UEC_01.marcarLuta(L[4],L[5]);
        UEC_01.lutar();
        
        L[0].status();
        L[1].status();
            
    }
    
}
