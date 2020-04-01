/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodetela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Ronan
 */
public class ResolucaoDeTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension resolucao = kit.getScreenSize();
        
        System.out.println("Sua tela tem resolução: "+resolucao.width +" x "+resolucao.height);
    }
    
}
