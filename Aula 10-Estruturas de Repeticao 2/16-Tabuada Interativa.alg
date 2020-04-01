algoritmo "Tabuada Interativa "
var
   Cont,N,Res:Inteiro
inicio
      Cont <- 1
      Res <- 0
      Escreva ("Você deseja saber a tabuada que que número ?")
      Leia (N)

      Repita
            Res <- Cont * N
            Escreval (Cont, " x ", N ," = ",Res )

            Cont <- Cont + 1
      Ate (Cont > 10)
fimalgoritmo
