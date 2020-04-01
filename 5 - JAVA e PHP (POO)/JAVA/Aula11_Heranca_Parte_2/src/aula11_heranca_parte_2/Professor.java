/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula11_heranca_parte_2;

/**
 *
 * @author ronan
 */
public class Professor extends Pessoa{
    //Atributos
    private String especialidade;
    private float salario;
    
    //Getters and Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //Métodos Específicos
    public void apresentarProfessor(){
        System.out.println("=========== Professor ==========");
        this.apresentar();
        System.out.println("Especialidade: "+this.getEspecialidade());
        System.out.println("Salário: "+this.getSalario());
    }
    
    public void receberAumento(float valor){
        this.setSalario(this.getSalario() + valor);
    }
    
    
}
