algoritmo "semnome"
var
   Cont,Q:Inteiro
   S,Valor,Maior,Menor:Real


inicio
      Cont <-1
      S <- 0
      Escreva ("Quantas valores você deseja inserir ?")
      Leia (Q)
      Enquanto (Cont <= Q) faca
               Escreval ("---------------------------")
               Escreva  ("Digite o ",Cont,"º valor: ")
               Leia (Valor)
                    Se (Valor > Maior) entao  //Quando o menor número esta no primeiro digitado ele reconhece como "0"
                       Maior  <- Valor
                    Senao
                        Menor <- Valor
                    Fimse
               S <- S + Valor
               Cont <- Cont + 1
      FimEnquanto

      Escreval ("-----------------------------------------")
      Escreval ("A soma é :",S)
      Escreval ("O Maior número digitado foi :",Maior)
      Escreval ("O Menor número digitado foi :",Menor)
      
fimalgoritmo
