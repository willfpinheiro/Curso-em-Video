algoritmo "Maioridade"
var
      Ano,Ano_Nasc,Idade: Inteiro
inicio
      Escreva ("Em qual ano nós estamos ?")
      Leia (Ano)
      Escreva ("Em que ano você nasceu ? ")
      Leia (Ano_Nasc)
      Idade <-  Ano - Ano_Nasc
      Escreva("Você tem ",Idade," anos ")
      Se (Idade >= 18) entao
         Escreva (" e ja tem a maioridade.")
      Senao
           Escreva("ainda é menor de idade.")
      FimSe
      
fimalgoritmo
