algoritmo "Fatorial"

var
   Cont,N,F:Inteiro
   Resp:Caractere
inicio
Repita
      Escreva ("Qual número você desja extrair o fatorial? ")
      Leia (N)
      Cont <- N
      F <- 1
      
            Repita
                  F <- F * Cont
                  Cont <- Cont - 1
            Ate (Cont < 1)

      Escreval ("o Fatorial de ",N," é: ",F)
      Escreva ("Deseja continuar ? [S/N]")
      Leia (Resp)
      Limpatela
Ate (Resp= "N")

fimalgoritmo
