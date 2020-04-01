algoritmo "Emprestimo"
var
      Emp,Juros,ValorTot,Parcela:Real
inicio
      Escreva ("Qual o valor que você deseja de emprestimo ? ")
      Leia (Emp)
      Escreva ("Quantas parcelas você deseja pagar ? ")
      Leia (Parcela)
      
      Juros     <-  Emp * 20 / 100
      ValorTot  <-  Emp + Juros
      Parcela   <-  ValorTot / Parcela


      Escreval ("O valor dos Juros é R$ ",Juros)
      Escreval ("O valor Total a pagar é de R$ ",ValorTot)
      Escreval ("O valor de cada parcela será : R$ ",Parcela)
      
fimalgoritmo
