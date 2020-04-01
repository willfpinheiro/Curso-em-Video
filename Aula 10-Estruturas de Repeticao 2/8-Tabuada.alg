algoritmo "Tabuada"
var
   Cont,N,Valor:Inteiro

inicio
     Cont <-0
     Escreva ("Qual o numero que voce deseja a tabuada? ")
     Leia (N)

     Repita
           Valor <- N * Cont
           Escreval (N,"x",cont,Valor)
           Cont <- Cont + 1

     Ate(Cont > 10)
fimalgoritmo
