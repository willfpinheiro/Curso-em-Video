algoritmo "Corrigindo Provas"
var
   Gab:vetor [1..5] de Caractere
   Aluno:Vetor [1..3] de Caractere
   RespAl:vetor [1..5] de Caractere
   Nota:vetor [1..3] de Real
   MediaT,Soma:Real
   Cont:Inteiro

   Funcao ProvaAluno():Real
   Var
      NotaFinal:Real
   Inicio
                //Resposta do Aluno
           Para Cont <- 1 ate 5 faca
                Escreva ("Questão  ",Cont," : ")
                Leia (RespAl[Cont])
                Se (RespAl[Cont]=Gab[Cont]) entao
                   NotaFinal <- NotaFinal + 2
                FimSe
                Retorne NotaFinal
           FimPara
    FimFuncao

inicio

      Escreval ("PASSO 1 - Cadastro do Gabarito")
      Escreval ("------------------------------")
      //Cadastro do Gabarito
      Para Cont <- 1 ate 5 faca
           Escreva("Questao ",Cont," : ")
           Leia (Gab[Cont])
      FimPara
      LimpaTela
      //Cadastro de Alunos
      Para Cont <- 1 ate 3 faca
           LimpaTela
           Escreval ("---------------")
           Escreval ("Aluno",Cont)
           Escreval ("---------------")
           Escreva("Nome: ")
           Leia (Aluno[Cont])
           Nota[Cont] <- ProvaAluno()
           Soma <- Soma + Nota[Cont]


      FimPara

      Escreval ("Notas Finais")
      Escreval ("-------------------------------")
      Para Cont <- 1 ate 3 faca
           Escreval (Aluno[Cont]:15,Nota[Cont])
      FimPara
      Escreva ("-------------------------------")

      Escreva("Media da Turma:",MediaT)

fimalgoritmo
