algoritmo "Somador Interativo (Enquanto)"
var

   S,Valor:Inteiro
   Resp:Caractere

inicio
      Resp <- "S"  //Gambiarra
      S <- 0

      Enquanto (Resp = "S") faca
               Escreva ("Digite um número : ")
               Leia (Valor)
               S <- S + Valor
               Escreva ("Deseja continuar? [S/N]")// Qualquer caractere corresponde ao "N"
               Leia (Resp)

      FimEnquanto
      Escreva ("A soma dos valores digitados é ",S)
fimalgoritmo
