algoritmo "Contador Inteligente"

var
   Cont,In,Fim:Inteiro

inicio

      Escreva ("Início: ")
      Leia (In)
      Cont <- In // A partir daqui o contador irá detectar se o número é maior que o fim e vice-versa
      Escreva ("Fim: ")
      Leia (Fim)
      
      Se (In <= Fim) entao

         Enquanto (Cont <= Fim) faca
                  Escreva (Cont,"..")
                  Cont <- Cont + 1
         FimEnquanto
      Senao
           Enquanto (Cont >= Fim) faca
                    Escreva (Cont,"..")
                    Cont <- Cont -1
           FimEnquanto
      
      FimSe

fimalgoritmo
