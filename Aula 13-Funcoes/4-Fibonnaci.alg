algoritmo "Fibonnaci"

var
   Cont,T1,T2,T3:Inteiro
   Funcao ProximoFiboncci (var N1,N2:Inteiro):Inteiro
   Var
      N3:Inteiro
   Inicio
         N3 <- N1 + N2
         N1 <- N2
         N2 <- N3
         Retorne N3
   
   FimFuncao
inicio
      T1 <- 0
      Escreval(T1)
      T2 <- 1
      Escreval (T2)
      
      Para Cont <- 3 ate 15 faca
           T3 <- ProximoFiboncci (T1,T2)
           Escreval (T3)
      FimPara

fimalgoritmo
