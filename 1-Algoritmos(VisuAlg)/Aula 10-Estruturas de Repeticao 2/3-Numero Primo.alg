algoritmo "N�mero Primo"

var
   Cont,N,ContDiv:Inteiro
   Resp: Caractere

inicio
      Cont <- 1
      ContDiv <-0


      Escreval ("==========================")
      Escreval ("N�mero Primo ou N�o Primo ")
      Escreval ("==========================")


      Escreva ("Digite um N�mero ->>>> ")
      Leia (N)

      Repita

            Se(N % Cont = 0) entao
                 ContDiv <- ContDiv + 1
            FimSe

            Cont <-Cont + 1
      Ate (Cont > N)

      Se (ContDiv > 2) entao
         Escreval ("O n�mero ",N," n�o � Primo.")
      Senao
         Escreval("O n�mero ",N," � Primo.")
      FimSe
      

fimalgoritmo
