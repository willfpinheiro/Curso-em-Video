algoritmo "O melhor aluno"
var
    Cont,Q_Aluno:Inteiro
    Nota,Melhor_Nota,Menor_Nota:real
    Nome,Melhor_Aluno,Pior_Aluno: Caractere
inicio
      Cont <-1
      Escreva ("Quantos alunos há em sua turma: ")
      Leia (Q_Aluno)
      
      Enquanto (Cont <= Q_Aluno) faca
               Escreval("---------------------------")
               Escreva ("Nome do aluno: ")
               Leia (Nome)
               Escreva ("A nota de(a)",Nome," é: ")
               Leia (Nota)
                    Se (Nota > Melhor_nota) entao
                       Melhor_Nota <- Nota
                       Melhor_Aluno <- Nome
                    Senao
                         Menor_Nota <- Nota
                         Pior_Aluno <-Nome // Quando a menor é o primeiro inserido no final vai reconhecer como "0"
                    Fimse
               Cont <- Cont + 1
      FimEnquanto

      Escreval("-----------------------------------------------------------")
      Escreval(" O melhor aproveitamento foi de (a)",Melhor_Aluno," com a nota",Melhor_Nota)
      Escreval("-----------------------------------------------------------")
      Escreval("")
      Escreval("-----------------------------------------------------------")
      Escreval (" O pior aproveitamento foi de (a)",Pior_Aluno," com a nota",Menor_Nota )
      Escreval("-----------------------------------------------------------")






fimalgoritmo
