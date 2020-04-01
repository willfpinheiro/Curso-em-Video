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
public class Aula10_Herança_Parte_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância da classe Pessoa(SuperClasse)
        Pessoa p1 = new Pessoa();
        p1.setNome("Talita");
        p1.setIdade(28);
        p1.setSexo('t');
        p1.fazerAniverssario();
        p1.fazerAniverssario();
        p1.apresentar();
        
        //Instância da classe Aluno(subclasse)
        Aluno p2 = new Aluno();
        p2.setNome("Ronan");
        p2.setIdade(21);
        p2.setSexo('m');
        p2.setMatricula(true);
        p2.setCurso("Técnico em Informática");
        p2.fazerAniverssario();
        p2.apresentarAluno();
        
        //Instância da classe Professor(subclasse)
        Professor p3 = new Professor();
        p3.setNome("Hálisson");
        p3.setIdade(40);
        p3.setSexo('m');
        p3.setEspecialidade("Informática");
        p3.setSalario(1500);
        p3.receberAumento(500);
        p3.fazerAniverssario();
        p3.apresentarProfessor();
        
        //Instância da classe Funcionario(subclasse)
        Funcionario p4 = new Funcionario();
        p4.setNome("Jéssica");
        p4.setIdade(30);
        p4.setSexo('f');
        p4.setSetor("Coordernação");
        p4.fazerAniverssario();
        p4.mudarTrabalho();
        p4.apresentarFuncionario();
    }
    
}
