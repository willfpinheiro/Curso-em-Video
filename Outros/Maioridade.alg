algoritmo "Maioridade penal"
var
   ano,nasc,idade:inteiro
inicio
      Escreva ("Qual é o ano atual: ")
      Leia (ano)
      Escreva ("Em que ano você nasceu: ")
      Leia (nasc)
           idade <- ano-nasc
      Escreva("Você tem ",idade," anos,portanto")
      Se (idade < 18) entao
         Escreva(" você é menor de idade")
      Senao
         Escreva (" você já é maior de idade")

      FimSe


fimalgoritmo
