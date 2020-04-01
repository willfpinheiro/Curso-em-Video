algoritmo "Somador"
var
   S,N: inteiro
   resp:Caractere

inicio
      S <- 0
      Repita
            Escreva ("Digite o valor ==> ")
            Leia (N)
            S <- S + N
            Escreva ("Você quer continuar? [S/N]")
            Leia (resp)
      Ate (resp ="N")
      Escreva ("A soma de todos os valores digitados é : ",S)

fimalgoritmo
