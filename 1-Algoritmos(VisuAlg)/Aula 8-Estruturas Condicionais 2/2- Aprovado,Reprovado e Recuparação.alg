algoritmo "Aprovado"
var
   N1,N2,N3,Soma,Media: real
   Situacao:Caractere

inicio
      Escreval ("--------------------------------------------------------------")
      Escreval ("Funda��o Centro de An�lise, Pesquisa e Inova��o Tecnol�gica")
      Escreval ("                        FUCAPI                             ")
      Escreval ("--------------------------------------------------------------")
      Escreval ("            Curso: T�cnico em Inform�tica                     ")
      Escreva ("Digite a primeira nota: ")
      Leia (N1)
      Escreva ("Digite a segunda nota : ")
      Leia (N2)
      Escreva ("Digite a terceira nota: ")
      Leia (N3)
              Soma  <- N1+N2+N3
              Media <- Soma / 3

      Se (Media >=7) entao
           Situacao <- ("APROVADO")
      senao

           Se(Media >=5) e (Media <7)entao
                Situacao <- ("EM RECUPERA��O")
           Senao
                Situacao <- ("REPROVADO")
           fimse

      fimse

      Escreval ("-----------------")
      Escreval ("    STATUS       ")
      Escreval ("-----------------")
      Escreval ("Soma das Notas �: ",Soma)
      Escreval ("A m�dia entre",N1,N2,N3," �: ",Media:4:2)
      Escreva ("Situa��o:",Situacao)



fimalgoritmo
