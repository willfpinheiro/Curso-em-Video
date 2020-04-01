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
public class Gafanhoto extends Pessoa{
    //Atributos
    private String login;
    private int totalAssistido;
    
    //Construtor
    public Gafanhoto(String nome,int idade,char sexo,String login){
        super(nome,idade,sexo); //Chamada ao construtor de Pessoa
        this.setLogin(login);
        this.setTotalAssistido(0);
    }
    
    //Getters and Setters

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }
    
    
    //Método Específico
    
    public void viuMaisUm(){
        this.setTotalAssistido(this.getTotalAssistido() + 1);
    }
    
    //Método Sobreposto
    
    @Override
    protected void apresentarGafanhoto() {
        System.out.println("========== Gafanhoto ===========");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Login: "+this.getLogin());
        System.out.println("Nº de vídeos assistidos: "+this.getTotalAssistido());
        System.out.println("Experiência: "+this.getExperiencia()+"\n");
    }
    
    @Override
    protected void ganharExperiencia() {
        this.setExperiencia(this.getExperiencia() + 1);
    }

    
    
}
