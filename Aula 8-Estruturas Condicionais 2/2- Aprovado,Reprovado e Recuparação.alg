algoritmo "Aprovado"
var
   N1,N2,N3,Soma,Media: real
   Situacao:Caractere

inicio
      Escreval ("--------------------------------------------------------------")
      Escreval ("Fundação Centro de Análise, Pesquisa e Inovação Tecnológica")
      Escreval ("                        FUCAPI                             ")
      Escreval ("--------------------------------------------------------------")
      Escreval ("            Curso: Técnico em Informática                     ")
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
                Situacao <- ("EM RECUPERAÇÃO")
           Senao
                Situacao <- ("REPROVADO")
           fimse

      fimse

      Escreval ("-----------------")
      Escreval ("    STATUS       ")
      Escreval ("-----------------")
      Escreval ("Soma das Notas é: ",Soma)
      Escreval ("A média entre",N1,N2,N3," é: ",Media:4:2)
      Escreva ("Situação:",Situacao)



fimalgoritmo
