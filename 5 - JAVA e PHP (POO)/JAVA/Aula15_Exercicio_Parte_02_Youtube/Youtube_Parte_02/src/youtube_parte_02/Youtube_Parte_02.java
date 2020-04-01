/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youtube_parte_02;

/**
 *
 * @author ronan
 */
public class Youtube_Parte_02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância de Video
        Video video[] = new Video[3];
        
        video[0] = new Video("Star Wars: Rogue One");
        video[1] = new Video("Documentário - Hackers: Criminosos ou Hérois");
        
        video[0].apresentarVideo();
        video[1].apresentarVideo();
        
        //Instância de Gafanhoto
        Gafanhoto gaf[] = new Gafanhoto[3];
        
        gaf[0] = new Gafanhoto("Ronan Jordão",21,'m',"ronan_21");
        gaf[1] = new Gafanhoto("Carol ",20,'f',"carol_20");
        
        gaf[0].apresentarGafanhoto();
        gaf[1].apresentarGafanhoto();
        
        //Instância de Visualização
        Visualizacao vis[] = new Visualizacao[3];
        
        vis[0] = new Visualizacao(gaf[0],video[0]); // Ronan visualiza Star Wars
        vis[1] = new Visualizacao(gaf[1],video[0]); // Carol visualiza Documentário sobre Hackers
        
        vis[0].apresentarVisualizacao();
        vis[0].avaliar();
        vis[1].apresentarVisualizacao();
        vis[1].avaliar(60f);
        
        video[0].apresentarVideo();
        video[1].apresentarVideo();
    }
    
}
