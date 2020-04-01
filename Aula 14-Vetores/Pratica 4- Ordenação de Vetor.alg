algoritmo "Ordenação de Vetor"
var
   Vet:Vetor [1..4] de Inteiro
   I,J,Aux:Inteiro
inicio
      Para  I <- 1 ate 4 faca
            Escreva ("Digite um valor : ")
            Leia (Vet[I])
      FimPara
      
      Para I <- 1 ate 3 faca
           Para J <- I + 1 ate 4 faca
                Se (Vet[I] > Vet[J]) entao
                   Aux <- Vet[I]
                   Vet[I]<- Vet [J]
                   Vet[J]<- Aux
                FimSe
           FimPara
      FimPara
      
      Para I <- 1 ate 4 faca
           Escreva ("{",Vet[I],"}")
      FimPara
fimalgoritmo
