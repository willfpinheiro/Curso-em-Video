algoritmo "Par Ou Ímpar"
var
   N:Inteiro

   Procedimento ParouImpar (V:Inteiro)
   Inicio
          Se (V % 2 = 0)entao
             Escreva ("O numero ",V," é Par")
          Senao
               Escreva ("O número ",V," é Ímpar")
          Fimse
   FimProcedimento
inicio
      Escreva ("Digite um número: ")
      Leia (N)
      ParouImpar (N)
fimalgoritmo
