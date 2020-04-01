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
public class Video implements AcoesVideo{
    //Atributos
    private String titulo;
    private float avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Construtor
    public Video(String titulo){
        this.setTitulo(titulo);
        this.setAvaliacao(0);
        this.setViews(0);
        this.setCurtidas(0);
        this.setReproduzindo(false);
    }
    
    
    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(float avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    //Métodos Abstratos
    
    @Override
    public void apresentarVideo() {
        System.out.println("============= Vídeo ================");
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Views: "+this.getViews());
        System.out.println("Avaliação: "+this.getAvaliacao());
        System.out.println("Curtidas: "+this.getCurtidas());
        System.out.println("Status: "+this.isReproduzindo());
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false);
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    
    
}
