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
public class Aula09_ExercicioPratico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instâncias da Pessoa
        Pessoa leitor[] = new Pessoa[2];
        
        leitor[0] = new Pessoa("Ronan",21,'M');
        leitor[1] = new Pessoa("Eliana",18,'F');
        
        leitor[0].apresentar();
        leitor[1].apresentar();
        
        
        
        
        
        //Instâncias do Livro
        Livro livro[] = new Livro[3];
        
        livro[0] = new Livro("Fernando Pessoa","A poesia da vida",150,leitor[1]);
        livro[1] = new Livro("Rodrigo Lima","A tecnologia atual",200,leitor[0]);
        livro[2] = new Livro("Gustavo Guanabara","Linguagem Java",100,leitor[0]);
        
            livro[0].detalhes();
            livro[1].detalhes();
            livro[2].detalhes();
        
    }
    
}
