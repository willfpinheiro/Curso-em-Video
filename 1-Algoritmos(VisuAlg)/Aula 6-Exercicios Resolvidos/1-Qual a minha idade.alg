algoritmo "Qual a minha Idade"

var
   Ano_At,Ano_Nasc,Idade:Inteiro
   Cond:Logico

inicio
      Escreva ("Em que ano nós estamos ? ")
      Leia (Ano_At)
      Escreva ("Qual o ano em que nasci ? ")
      Leia (Ano_Nasc)
      Idade <- Ano_At - Ano_Nasc
      Escreva("")
      Escreval ("A minha idade é de ",Idade)
      Cond <- (Idade >= 18)
      Escreva ("Eu sou maior de Idade ?",Cond)
      
fimalgoritmo
