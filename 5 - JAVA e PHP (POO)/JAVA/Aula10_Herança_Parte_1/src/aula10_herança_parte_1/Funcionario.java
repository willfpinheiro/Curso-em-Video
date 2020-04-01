/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula10_herança_parte_1;

/**
 *
 * @author ronan
 */
public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Getters and Setters

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    //Métodos Específicos
    public void apresentarFuncionario(){
        System.out.println("----------- Funcionario ----------");
        this.apresentar();
        System.out.println("Setor: "+this.getSetor());
        System.out.println("Trabalhando ou não? "+this.isTrabalhando());
    }
    
    public void mudarTrabalho(){
        this.setTrabalhando(!this.isTrabalhando());
    }
    
}
