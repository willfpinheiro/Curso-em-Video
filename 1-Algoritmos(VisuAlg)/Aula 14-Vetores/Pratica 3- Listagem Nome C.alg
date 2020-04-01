algoritmo "Nomes com C"
var
   Nome:Caractere
   SoC:Vetor [1..5] de Caractere
   Cont,Tot:Inteiro
inicio
      Tot <- 0
      Para Cont <- 1 ate 5 faca
           Escreva ("Digite o",Cont,"º Nome -> ")
           Leia (Nome)
           Se (copia(Maiusc(Nome),1,1)="C") entao
              Tot <- Tot + 1
              SoC[Tot] <- Nome
           FimSe
      FimPara
      
      Escreval("")
      Escreval ("Listagem Final")
      Escreval("-------------------")

      Para Cont <- 1 ate Tot faca
           Escreval (SoC[Cont])
      FimPara
fimalgoritmo
