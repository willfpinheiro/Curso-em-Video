algoritmo "Somador"
var
   S,Valor:Inteiro
   Resp:Caractere

inicio
      S <- 0
      Repita
            Escreval ("-----------------------")
            Escreva  ("Digite um valor ==> ")
            Leia (Valor)

            S <- S + Valor
            Escreva ("Deseja Continuar ? [S/N]")
            Leia (Resp)

      Ate (Resp = "N")
      Escreva ("A soma dos valores digitados é ",S)
fimalgoritmo
