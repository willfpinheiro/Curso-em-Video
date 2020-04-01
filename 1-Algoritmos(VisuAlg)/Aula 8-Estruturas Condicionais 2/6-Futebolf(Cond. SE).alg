algoritmo "Estatistica esportiva"
// Função :
// Autor :
// Data : 29/11/2014
// Seção de Declarações 
var
      SP,PM,Dif:Inteiro
      STATUS:Caractere


inicio
      Escreval ("========================")
      Escreval ("  São Paulo X Palmeiras ")
      Escreval ("========================")
      Escreva ("Quantos gols São Paulo fez ?")
      Leia (SP)
      Escreva ("Quantos gols Palmeiras fez ?")
      Leia (PM)
           Dif <-  Abs (SP - PM)

      
      Se (Dif >0)e (Dif <=3) entao
         STATUS <- ("PARTIDA NORMAL")
      Senao
           Se (Dif >3) entao
              STATUS <- ("GOLEADA")
           Senao
                STATUS <-("EMPATE")
           Fimse
      fimse
      
      
      Escreval("----------------------")
      EscrevaL(    "Diferença: ",Dif   )
      Escreval(    "Status: ",STATUS   )
      Escreval("----------------------")

      

fimalgoritmo
