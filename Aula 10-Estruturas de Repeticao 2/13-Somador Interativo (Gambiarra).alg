algoritmo "Somado 5 vezes"
var
   S,N:Inteiro
   Resp:Caractere
   

inicio

      S <- 0
      Resp <- "S"
      Enquanto (Resp = "S") faca
               Escreva ("Digite o número ===>")
               Leia (N)
               S <- S + N
               Escreva ("Você deseja continuar ? [S/N]")
               Leia (Resp)
      FimEnquanto
      Escreva ("O soma desses números é :",S )
fimalgoritmo
