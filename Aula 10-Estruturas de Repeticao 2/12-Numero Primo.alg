algoritmo "Número Primo"
var
   Cont,N,TotDiv:INTEIRO
inicio
      Cont <- 1
      TotDiv <- 0
      Escreva ("Digite um número --->")
      Leia (N)

      Repita
            Se (N % Cont = 0)entao
               TotDiv <- TotDiv + 1
            Fimse
            Cont <- Cont + 1
      Ate (Cont > N)
      
      Se (TotDiv <=2) entao
         Escreva ("O número ",N, " é primo")
      Senao
           Escreva ("O número ",N," não é primo")
      Fimse
fimalgoritmo
