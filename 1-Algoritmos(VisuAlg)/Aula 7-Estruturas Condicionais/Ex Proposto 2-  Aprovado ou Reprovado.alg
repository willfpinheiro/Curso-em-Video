algoritmo "Aprovado ou Reprovado"
var
      N1,N2,Media: Real

inicio
      Escreval ("--------------------------")
      Escreval ("          FUCAPI          ")
      Escreval ("--------------------------")
      Escreva ("Digite a Primeira Nota : ")
      Leia (N1)
      Escreva ("Digite a Segunda Nota : ")
      Leia (N2)
      Media <- (N1 + N2) / 2
      Escreval("--------------------------")
      Escreval("Média: ",Media)
      Escreva ("Situação: ")
      Se (Media >= 7) entao
         Escreval ("Aprovado")
      Senao
         Escreval ("Reprovado")
      FimSe
      Escreval("--------------------------")
fimalgoritmo
