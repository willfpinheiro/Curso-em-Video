/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author Ronan
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mostrar Mensagem//JOptionPane.showMessageDialog(null,"Olá Cara","Boas Vindas",JOptionPane.INFORMATION_MESSAGE);
        
        int num,
            soma = 0,
            totNum = 0,
            totPar = 0,
            totImpar = 0,
            totAcima100 = 0;
        int media = 0;
        
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog
                        (null,"<html>Informa um número: <br> <em> (valor 0 interrompe)</em> </html>") );
           
            soma += num;
            
            //Verificar se o número é diferente de 0 para proseguir os outros testes lógicos
            if(num != 0){
                totNum ++;
                //Par ou Impar
                if(num % 2 == 0){
                   totPar ++; 
                }else{
                    totImpar ++;
                }
                //Acima de 100
                if(num > 100){
                    totAcima100 ++;
                }
            }
            
        }while(num != 0);
        
        JOptionPane.showMessageDialog(null,"<html>Resultado Final <hr> " +
                                    "<br>"+"Total de Valores: "+totNum+
                                    "<br>"+"Total de Pares:   "+totPar+ 
                                    "<br>"+"Total de Ímpares: "+totImpar+ 
                                    "<br>"+"Valores acima de 100: "+totAcima100+
                                    "<br>"+"Média dos Valores: "+(media = soma / totNum)+    
                                            "</html>");
    }
    
}
