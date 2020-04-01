algoritmo "Turma"
var
   Nome:vetor [1..4] de Caractere
   N1:Vetor [1..4] de Real
   N2:Vetor [1..4] de Real
   MelhorAl:Vetor [1..4] de Caractere
   Media:Vetor [1..4] de Real
   SMedia,MediaT:Real
   Cont,Aluno_Media:Inteiro

inicio
      Para Cont <- 1 ate 4 faca
           Escreval ("")
           Escreval ("-----------------------------")
           Escreval ("ALUNO",Cont)
           Escreva ("Digite o Nome do Aluno: ")
           Escreva()
           Leia (Nome[Cont])
           Escreva ("Digite a Nota 1: ")
           Leia (N1[Cont])
           Escreva ("Digite a Nota 2:")
           Leia (N2[Cont])
           Media[Cont] <- ( N1[Cont] + N2[Cont] ) / 2
           Escreval ("Media : ",Media[Cont])
           SMedia <- SMedia + Media[Cont]
      FimPara
      MediaT <- SMedia / 4
      LimpaTela
      Escreval ("Listagem de Alunos")
      Escreval ("------------------------")
      Escreva  ("")

      Para Cont <- 1 ate 4 faca
           Escreval (Nome[Cont]:15,Media[Cont]:4:1)
           Se (Media[Cont] > MediaT ) entao
              Aluno_Media <- Aluno_Media + 1
              MelhorAl[Cont] <- Nome[Cont]
           FimSe
      FimPara

      Escreval("Existem ",Aluno_Media," alunos acima da média da turma que é de ",MediaT:4:1)
      Escreval ("")
      Escreval ("Alunos acima da Média")
      Escreval ("-----------------------")

      Para Cont <- 1 ate 4 faca
          Escreval (MelhorAl[Cont])
      FimPara
fimalgoritmo
