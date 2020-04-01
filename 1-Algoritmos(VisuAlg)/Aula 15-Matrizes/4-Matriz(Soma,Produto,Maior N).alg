algoritmo "semnome"
// =============================================================
// Algoritmo para ler uma matriz de quarta ordem e mostrar no final:
// - A soma dos valores da diagonal principal
// - O produto dos valores da segunda linha
// - O maior valor da terceira coluna
// =============================================================

var
   Mat:vetor [1..4,1..4] de Inteiro
   l,c,sDP,p2l,m3c:Inteiro
inicio
     sDP <- 0
     p2l <- 1
     m3c <- 0

      Para l <- 1 ate 4 faca
           Para c <- 1 ate 4 faca
                Escreva ("Digite o valor na posição [ ",l,",",c," ] :")
                Leia (Mat[l,c])
                //Soma da Diagonal
                Se (l = c) entao
                   sDP <- sDP + Mat[l,c]
                FimSe
                
           FimPara
      FimPara

      //Produto
      Para c <- 1 ate 4 faca
          p2l <- p2l * Mat[2,c]
      FimPara

       //Maior da 3º Coluna
      Para l <- 1 ate 4 faca
           Se (Mat[l,3] > m3c ) entao
              m3c <- Mat [l,3]
           Fimse
      Fimpara
      
      //Saida de dados
      Para l <- 1 ate 4 faca
           Para c <- 1 ate 4 faca
                Escreva (Mat[l,c]:4)
           FimPara
           Escreval ()
      FimPara
      
      Escreval("A soma dos valores da Diagonal Principal é : ",sDP)
      Escreval ("O produto dos valores da segunda linha é : ",p2l)
      Escreval("O maior número da 3º Coluna é : ",m3c)



fimalgoritmo
