algoritmo "Conversor de Moedas"
var
   Cont,Q:Inteiro
   reais,dolar:real

inicio
      Cont <- 1
      Escreval("Quantas vezes você deseja converter")
      Leia (Q)
      
      Enquanto (Cont <= Q) faca
               Escreval ("------------------------")
               Escreva  ("Digite o valo em R$: ")
               Leia (reais)
               dolar <- reais /2.5887997
               Escreval ("O valor do U$$ é: ",dolar :5:2)
               Cont <- Cont +1
      
      FimEnquanto
fimalgoritmo
