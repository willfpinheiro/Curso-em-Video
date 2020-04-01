/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube_parte_01;

/**
 *
 * @author ronan
 */
public class Youtube_Parte_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância de Video
        Video video[] = new Video[2];
        
        video[0] = new Video("Guardiões da Galáxia 2");
        video[1] = new Video("Aprendendo ser Hacker");
        
        video[0].apresentarVideo();
        
        //Instância de Gafanhoto
        Gafanhoto gaf[] = new Gafanhoto[3];
        
        gaf[0] = new Gafanhoto("Ronan Jordão",21,'m',"ronan_21");
        gaf[1] = new Gafanhoto("Laura Fernandez",19,'f',"laura_19");
       
        gaf[0].apresentarGafanhoto();
        gaf[1].apresentarGafanhoto();
        
    }
    
}
