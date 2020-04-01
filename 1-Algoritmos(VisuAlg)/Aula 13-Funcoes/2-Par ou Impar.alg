algoritmo "Par ou Impar"
var
   N:Inteiro
   R:Caractere
   Funcao  ParouImpar(V:inteiro):Caracter
   Inicio
         Se (V % 2 = 0)entao
            Retorne "Par"
         Senao
              Retorne "Impar"
         FimSe
   FimFuncao
inicio
      Escreva ("Digite um número ==> ")
      Leia (N)
      R <- ParouImpar (N)
      Escreva ("O número ",N," é ",R)



fimalgoritmo
