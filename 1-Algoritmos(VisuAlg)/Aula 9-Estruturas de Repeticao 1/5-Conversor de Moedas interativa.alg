algoritmo "Conversor de Moedas"
var
   Cont,Q:Inteiro
   reais,dolar:real

inicio
      Cont <- 1
      Escreval("Quantas vezes voc� deseja converter")
      Leia (Q)
      
      Enquanto (Cont <= Q) faca
               Escreval ("------------------------")
               Escreva  ("Digite o valo em R$: ")
               Leia (reais)
               dolar <- reais /2.5887997
               Escreval ("O valor do U$$ �: ",dolar :5:2)
               Cont <- Cont +1
      
      FimEnquanto
fimalgoritmo
