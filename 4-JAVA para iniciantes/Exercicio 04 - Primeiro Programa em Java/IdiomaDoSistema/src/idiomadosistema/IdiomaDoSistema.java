/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idiomadosistema;

import java.util.Locale;

/**
 *
 * @author Ronan
 */
public class IdiomaDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Locale idioma = Locale.getDefault();
        
        System.out.println("O seu sistema está em "+idioma.getDisplayLanguage());
        System.out.println("Sigla : "+idioma.getLanguage());
    }
    
}
