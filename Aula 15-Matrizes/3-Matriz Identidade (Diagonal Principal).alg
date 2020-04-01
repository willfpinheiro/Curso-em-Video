algoritmo "Matriz Id. 3º "
var
   mID:vetor [1..6,1..6] de Inteiro
   i,j:Inteiro

inicio
      Para i <- 1 ate 6 faca
           Para  j <- 1 ate 6 faca
                 Se (i = j) entao
                    mID [i,j] <- 1
                 Senao
                      mID [i,j] <- 0
                 FimSe
           FimPara
      FimPara
      
      Para i <- 1 ate 6 faca
           Para j <- 1 ate 6 faca
                Escreva (mID[i,j]:4)
           FimPara
           Escreval ()
      FimPara
fimalgoritmo
