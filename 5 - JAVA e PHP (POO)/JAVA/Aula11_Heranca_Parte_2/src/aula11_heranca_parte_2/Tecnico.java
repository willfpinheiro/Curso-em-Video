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
public class Tecnico extends Aluno{
    //Atributos
    private int registroProfissional;
    
    //Getter and Setter

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    //Método Específico
    
    public void apresentarTecnico(){
        System.out.println("============= Técnico ==============");
        this.apresentar();
        System.out.println("Curso: "+this.getCurso());
        System.out.println("Mátricula: "+this.getMatricula());
        System.out.println("Registro Profissional: "+this.getRegistroProfissional());
    }
    
    public void praticar(){
        System.out.println("Estou praticando ...");
    }
    
    @Override
    public void pagarMensalidade(float valor){
        float valorMensal = 300;
        
        System.out.println(" ");
        System.out.println("-----------------------------------");
        
        if(valor == valorMensal){
            System.out.println("Mensalidade paga com sucesso !");
            System.out.println("Troco: R$ 0,00");
        }else if(valor > valorMensal){
            System.out.println("Mensalidade paga com sucesso !");
            System.out.println("Troco: "+(valor - valorMensal));
        }else{
            System.out.println("Não foi possível pagar a mensalidade.Dinheiro insuficiente . :/");
        }
    }
    
}
