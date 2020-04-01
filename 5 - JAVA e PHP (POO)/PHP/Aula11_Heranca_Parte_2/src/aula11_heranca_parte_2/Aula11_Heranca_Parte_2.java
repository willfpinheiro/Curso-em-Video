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
public class Aula11_Heranca_Parte_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância de Visitante
        Visitante vis = new Visitante();
        
        vis.setNome("Luciana");
        vis.setIdade(28);
        vis.setSexo('f');
        vis.fazerAniverssario();
        System.out.println("========== Visitante ===========");
        vis.apresentar();
        
        //Instância de Aluno
        Aluno alu = new Aluno();
        
        alu.setNome("Felipe");
        alu.setIdade(26);
        alu.setSexo('m');
        alu.setCurso("Sistema de Informação");
        alu.setMatricula("AAA111");
        alu.apresentarAluno();
        alu.pagarMensalidade(700);
        
        //Instância da Professor
        Professor prof = new Professor();
        
        prof.setNome("Rilmar");
        prof.setIdade(32);
        prof.setSexo('m');
        prof.setEspecialidade("Java Web");
        prof.setSalario(2.500f);
        prof.receberAumento(.500f);
        prof.apresentarProfessor();
        
        //Instância de Bolsista
        Bolsista bol = new Bolsista();
        
        bol.setNome("Helena");
        bol.setIdade(23);
        bol.setSexo('f');
        bol.setCurso("Engenharia de Software");
        bol.setMatricula("BBB111");
        bol.setBolsa(70); //25% 50% 70%
        bol.apresentarBolsista();
        bol.pagarMensalidade(200);
        bol.renovarBolsa();
        
        //Instância de Técnico
        Tecnico tec = new Tecnico();
        
        tec.setNome("Ronan");
        tec.setIdade(21);
        tec.setSexo('m');
        tec.setCurso("Técnico em Informática");
        tec.setMatricula("TEC001");
        tec.setRegistroProfissional(1423234);
        tec.apresentarTecnico();
        tec.pagarMensalidade(400);
        tec.praticar();
        
        
    }
    
}
