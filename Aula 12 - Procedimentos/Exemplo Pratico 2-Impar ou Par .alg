algoritmo "Par ou Impar"
var
   N:Inteiro
   Procedimento  ParouImpar (V:Inteiro)
   Inicio
         Se (N % 2=0) entao
            Escreva ("O número ",N," é par")
         Senao
              Escreva("O número ",N," é ímpar")
         FimSe
   FimProcedimento
inicio
      Escreva ("Digite um número : ")
      Leia (N)
      ParouImpar(N)
fimalgoritmo
