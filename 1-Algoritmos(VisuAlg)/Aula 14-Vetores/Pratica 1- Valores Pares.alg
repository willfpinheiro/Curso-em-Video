algoritmo "Valor Par"
var
   Val:vetor [1..7] de Inteiro
   Cont,TotPar:Inteiro

inicio
      TotPar <- 0
      Para Cont <- 1 ate 7 faca
           Escreva("Digite o",Cont,"º valor ==>")
           Leia (Val[Cont])

      FimPara

      Para Cont <- 1 ate 7 faca
           Se (Val[Cont] % 2 =0)entao
              TotPar <- TotPar + 1
              Escreval ("Existe um valor par na posição ->",Cont)
           FimSe
      FimPara

      Escreva ("Existe ",TotPar," números pares")

fimalgoritmo
