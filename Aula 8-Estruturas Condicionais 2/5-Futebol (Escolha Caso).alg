algoritmo "Gols"
var
   SP,CT,Dif:Inteiro
   Status:Caractere

inicio
      Escreval ("=======================")
      Escreval ("São Paulo X Corinthians")
      Escreval ("=======================")
      Escreva ("Quantos gols São Paulo fez? ")
      Leia (SP)
      Escreva ("Quantos gols Corinthians fez ")
      Leia (CT)
           Dif <- Abs(SP-CT)
      Escolha (Dif)
             Caso 0
             Status <- ("EMPATE")
             Caso 1,2,3
             Status <- ("Partida NORMAL")
             outroCaso
             Status <- ("GOLEADA")
      FimEscolha
      
      Escreval("------------------------")
      Escreval ("Diferença: ",Dif)
      Escreval ("Status: ",Status)
      Escreval("------------------------")




fimalgoritmo
