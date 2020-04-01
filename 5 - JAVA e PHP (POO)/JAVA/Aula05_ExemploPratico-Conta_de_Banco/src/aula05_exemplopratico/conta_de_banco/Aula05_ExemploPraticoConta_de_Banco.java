/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula05_exemplopratico.conta_de_banco;

/**
 *
 * @author ronan
 */
public class Aula05_ExemploPraticoConta_de_Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instância
        ContaBanco conta_01 = new ContaBanco();
        
        conta_01.abrirConta("CC");
        conta_01.setDono("Ronan");
        conta_01.setNumConta(3432435);
        conta_01.depositar(50);
        
        conta_01.sacar(90);
        conta_01.pagarMensalidade();
        conta_01.depositar(2);
        conta_01.fecharConta();
        conta_01.apresentar();
    }
    
}
