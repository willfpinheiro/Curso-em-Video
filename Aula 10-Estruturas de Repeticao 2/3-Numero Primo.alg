algoritmo "Número Primo"

var
   Cont,N,ContDiv:Inteiro
   Resp: Caractere

inicio
      Cont <- 1
      ContDiv <-0


      Escreval ("==========================")
      Escreval ("Número Primo ou Não Primo ")
      Escreval ("==========================")


      Escreva ("Digite um Número ->>>> ")
      Leia (N)

      Repita

            Se(N % Cont = 0) entao
                 ContDiv <- ContDiv + 1
            FimSe

            Cont <-Cont + 1
      Ate (Cont > N)

      Se (ContDiv > 2) entao
         Escreval ("O número ",N," não é Primo.")
      Senao
         Escreval("O número ",N," é Primo.")
      FimSe
      

fimalgoritmo
