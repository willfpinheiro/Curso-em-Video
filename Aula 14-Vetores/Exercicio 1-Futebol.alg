algoritmo "Torneio de Futebol"
var
   Time:vetor [1..3] de Caractere
   Cont1,Cont2:Inteiro

inicio
      Escreval("----------------------")
      Escreval("CAMPEONATO DE FUTEBOL")
      Escreval("----------------------")

      Para Cont1 <- 1 ate 3 faca
           Escreva("Nome do ",Cont1,"º Time : ")
           Leia (Time [Cont1])
      FimPara

      Escreval("----------------------")
      Escreval("   Tabela de Partidas ")
      Escreval("----------------------")
      
      Para Cont1 <- 1 ate 3 faca
           Para Cont2 <- 1 ate 3 faca
                Se (Cont1 <> Cont2) entao
                   Escreval(Time[Cont1]:12,"[ ] x [ ]",Time[Cont2])
                Fimse
           FimPara
      FimPara

fimalgoritmo
