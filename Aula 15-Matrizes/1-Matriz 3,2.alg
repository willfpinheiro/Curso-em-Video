algoritmo "Matriz"
var
   Mat:vetor [1..3, 1..2] de Inteiro
   l,c:Inteiro

inicio
      //Leitura de dados
      Para l <- 1 ate 3 faca
           Para c <- 1 ate 2 faca
                Escreva ("Digite um valor na posicão [",l,",",c,"]: ")
                Leia (Mat[l,c])
           FimPara
      FimPara
      //Saída de dados
      Para l <- 1 ate 3 faca
           Para c <- 1 ate 2 faca
                Escreva (mat[l,c]:5)
           FimPara
           Escreval()
      FimPara
fimalgoritmo
