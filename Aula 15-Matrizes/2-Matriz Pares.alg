algoritmo "Mostrar Par"
var
   Valores:vetor [1..3,1..3] de Inteiro
   l,c,TotPar:Inteiro

inicio
      Para l <- 1 ate 3 faca
           Para  c <- 1 ate 3 faca
                 Escreva ("Dicite o valor na posição [",l,",",c,"] :")
                 Leia (Valores[l,c])
           FimPara
      FimPara
      Escreval ("Matriz")
      Escreval ("--------------------------------------")

      TotPar <- 0
      Para l <- 1 ate 3 faca
           Para c <- 1 ate 3 faca
                Se (Valores[l,c] % 2 = 0) entao
                   Escreva ("{",Valores[l,c]:2,"}")
                   TotPar <- TotPar + 1
                Senao
                  Escreva (Valores[l,c]:4)
                FimSe
           FimPara
           Escreval()
      FimPara
      Escreva ("Existe ",TotPar," números pares")
fimalgoritmo
