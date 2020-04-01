algoritmo "Emprestimo"
var
   emprestimo,parcela,juros,valor_total:real

inicio
      Escreva ("Qual o valor do esprestimo que você deseja: R$")
      Leia (emprestimo)
      Escreva ("Em quantas parcelas você deseja pagar: ")
      Leia (parcela)
           juros <- emprestimo*20/100
           valor_total <- emprestimo+juros
           parcela <- valor_total/parcela

      Escreval ("O valor de devolução será : R$ ",valor_total)
      Escreval ("O valor de juros será: R$ ",juros)
      Escreva ("O valor em parcelas será: R$ ",parcela)


fimalgoritmo
