/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula09_exerciciopratico;

/**
 *
 * @author ronan
 */
public class Livro implements Publicacao{
    //Atributos
    private String titulo;
    private String autor;
    private int totalPaginas;
    private int paginaAtual;
    private boolean aberto;
    private Pessoa leitor; //tipo abstrato
    
    //Construtor
    public Livro(String autor,String titulo,int totalPaginas,Pessoa leitor){
        this.setAutor(autor);
        this.setTitulo(titulo);
        this.setTotalPaginas(totalPaginas);
        this.setLeitor(leitor); //Enviando todas as informações do obejetos leitor_01(nome,sexo,idade)
        //Inicializados
        this.setPaginaAtual(0);
        this.setAberto(false);
    }
    
    //Getters and Setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //Métodos Específicos
    
    public void detalhes(){
        System.out.println("------------ Detalhes do Livro -------------");
        System.out.println("Autor: "+this.getAutor());
        System.out.println("Título: "+this.getTitulo());
        System.out.println("Total de Páginas: "+this.getTotalPaginas()+" páginas");
        System.out.println("Leitor: "+this.getLeitor().getNome());
        System.out.println("Status do Livro: "+this.isAberto());
        System.out.println("Página atual: "+this.getPaginaAtual());
        System.out.println("--------------------------------------------");
    }
    
    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int pagina) {
        if(this.isAberto() && (pagina <= this.getTotalPaginas())){
            this.setPaginaAtual(pagina);
        }else{
            System.out.println("Página inexistente !");
            this.setPaginaAtual(0);
        }
    }

    @Override
    public void avancarPagina() {
        if(this.isAberto() && (this.getPaginaAtual() < this.getTotalPaginas())){
            this.setPaginaAtual(this.getPaginaAtual() + 1);
        }else{
            System.out.println("Página inexistente !");
        }
    }

    @Override
    public void voltarPagina() {
        if(this.isAberto() && (this.getPaginaAtual() != 0)){
            this.setPaginaAtual(this.getPaginaAtual() - 1);
        }else{
            System.out.println("Página inexistente !");
        }
            
    }
    
    
}
