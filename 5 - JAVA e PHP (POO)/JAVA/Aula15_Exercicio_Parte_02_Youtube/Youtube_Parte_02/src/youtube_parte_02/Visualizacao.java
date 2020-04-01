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
public class Visualizacao {
    //Atributos
    private Gafanhoto espectador;
    private Video filme;
    
    //Construtor
    public Visualizacao(Gafanhoto espectador,Video filme){
        this.setEspectador(espectador);
        this.setFilme(filme);
        this.getEspectador().viuMaisUm();
        this.getFilme().setViews(this.getFilme().getViews() + 1);
    }
    
    //Getters and Setters

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    //Métodos Específicos
    
    public void apresentarVisualizacao(){
        System.out.println("=============== Visualização ================");
        System.out.println("Espectador: "+this.getEspectador().getNome());
        System.out.println("Asssistindo agora: "+this.getFilme().getTitulo()+"\n");
    }
    
    //Métodos de Sobrecarga
    public void avaliar(){
        this.getFilme().setAvaliacao(5);
    }
    
    public void avaliar(int nota){
        this.getFilme().setAvaliacao(nota);
    }

    public void avaliar(float porcentagem){
        if(porcentagem <= 20){
            this.getFilme().setAvaliacao(3);
        }else if(porcentagem <= 50){
            this.getFilme().setAvaliacao(5);
        }else if(porcentagem <= 90){
            this.getFilme().setAvaliacao(8);
        }else{
            this.getFilme().setAvaliacao(10);
        }
    }
    
}
