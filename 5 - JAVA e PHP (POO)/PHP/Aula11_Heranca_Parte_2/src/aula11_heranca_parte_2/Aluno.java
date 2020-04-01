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
public class Aluno extends Pessoa{
    //Atributos
    private String matricula;
    private String curso;
    
    //Getters and Setters

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    //Métodos Específicos
    public void apresentarAluno(){
        System.out.println("============ Aluno ==============");
        this.apresentar();
        System.out.println("Curso: "+this.getCurso());
        System.out.println("Matricula:"+this.getMatricula());
    }
    
    
    public void pagarMensalidade(float valor){
        if(valor == 600){
            System.out.println("Mensalidade paga com sucesso !");
            System.out.println("Troco: 0");
        }else if(valor > 600){
            System.out.println("Mesalidade paga com sucesso !");
            System.out.println("Troco: R$ "+(valor - 600) );
        }else{
            System.out.println("A mensalidade não foi paga.Dinheiro insuficiente. :/");
        }   
    }
    
}
