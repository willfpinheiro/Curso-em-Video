algoritmo "Par ou Impar"
var
   N:Inteiro
   Procedimento  ParouImpar (V:Inteiro)
   Inicio
         Se (N % 2=0) entao
            Escreva ("O n�mero ",N," � par")
         Senao
              Escreva("O n�mero ",N," � �mpar")
         FimSe
   FimProcedimento
inicio
      Escreva ("Digite um n�mero : ")
      Leia (N)
      ParouImpar(N)
fimalgoritmo
