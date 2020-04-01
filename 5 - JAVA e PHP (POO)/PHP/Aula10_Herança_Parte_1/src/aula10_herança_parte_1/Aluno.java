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
public class Aluno extends Pessoa{
    //Atributos
    private boolean matricula;
    private String curso;
    
    //Getters and Setters
    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    //Método Específico
    public void apresentarAluno(){
        System.out.println("------------- ALUNO ---------------");
        this.apresentar();
        System.out.println("Curso: "+this.getCurso());
        System.out.println("Status do Curso: "+this.isMatricula());
    }
    
    public void cancelarMatricula(){
        System.out.println("Mátricula Cancelada !");
        this.setMatricula(false);
    }
    
}
