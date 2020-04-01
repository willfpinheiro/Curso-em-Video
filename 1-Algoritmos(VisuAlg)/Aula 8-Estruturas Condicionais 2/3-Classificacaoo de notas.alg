algoritmo "semnome"
var
   N1,N2,Media:real
   Classificacao:Caractere
inicio
      Escreva ("Nota 1: ")
      Leia(N1)
      Escreva ("Nota 2: ")
      Leia(N2)
              Media <- (N1+N2)/2

      Se (Media >=9) e (Media <=10) entao
         Classificacao <-("A")
      Senao
           Se (Media >=8) e (Media <9) entao
              Classificacao <- ("B")
           Senao
                Se (Media >=7)e (Media < 8) entao
                   Classificacao <- ("C")
                Senao
                     Se (Media >=6) e (Media <7) entao
                        Classificacao <-("D")
                     Senao
                          Se (Media >=5) e(Media <6) entao
                             Classificacao <- ("E")
                          Senao
                               Classificacao <-("F")
                          Fimse
                     Fimse
                Fimse
           Fimse
      Fimse

      Escreval ("---------------------------")
      Escreval ("           Status          ")
      Escreval ("---------------------------")
      Escreval ("Média: ",Media)
      Escreva  ("Classificação: ",Classificacao)
fimalgoritmo
