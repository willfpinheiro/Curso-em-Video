algoritmo "Apto ou Inapto"
var
      Ano,Ano_Nasc,Idade: Inteiro
inicio
      Escreval ("-------------------------------------")
      Escreval ("  Departamento de Trânsito (Detran)  ")
      Escreval ("-------------------------------------")
      Escreva ("Ano Atual :")
      Leia (Ano)
      Escreva ("Ano de nascimento :")
      Leia (Ano_Nasc)
      Idade <-  Ano - Ano_Nasc
      Escreval ("----------Status------------")
      Escreval ("IDADE:",Idade)
      Se (Idade >= 18) entao
           Escreval ("Apto a tirar cateira (C N H)")
      Senao
           Escreval("Inapto a tirar a carteira (C N H)")
      Fimse
      
      
fimalgoritmo
