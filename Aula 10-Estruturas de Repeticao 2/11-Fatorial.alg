algoritmo "Fatorial de 5"
var
   Cont,N,Fat: INTEIRO
   Resp : Caractere

inicio
Repita
      Escreva("Digite um número que deseje extrair o fatorial ?")
      Leia (N)
      Cont <- N
      Fat <- 1
      Repita

            Fat <- Fat * Cont
            Cont <- Cont - 1
      Ate (Cont < 1)
      Escreval ("O fatorial de ",N," é :",Fat)

      Escreval ("Deseja continuar ? [S/N]")
      Leia (Resp)
      LimpaTela
Ate (Resp = "N")

fimalgoritmo
