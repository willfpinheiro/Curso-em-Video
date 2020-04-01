algoritmo "Fatorial"
var
   N,F:Inteiro
   Funcao Fatorial (V:Inteiro):Inteiro
   Var
      Cont,R:Inteiro
   Inicio
         R <- 1
         Para Cont <- 1 ate V faca

              R <- R * Cont
         FimPara
         Retorne R
   FimFuncao
inicio
      Escreva("Digite um número ==>")
      Leia (N)
      F <- Fatorial (N)
      Escreva ("O valor de ",N," ! é igual a ",F)
fimalgoritmo
