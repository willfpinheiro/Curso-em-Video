algoritmo "semnome"
var
   Nome:Caractere
   Sal,Nsal:real
   Dep:inteiro
inicio
      Escreva ("Nome: ")
      Leia (Nome)
      Escreva ("Sal�rio: R$")
      Leia (Sal)
      Escreva ("N� de Dependentes: ")
      Leia (Dep)
      
      Escolha (Dep)
              Caso 0
                   Nsal <- Sal +(Sal*5/100)
              Caso 1,2,3
                   Nsal <- Sal +(Sal*10/100)
              Caso 4,5,6
                   Nsal <- Sal +(Sal*15/100)
              OutroCaso
                   Nsal <- Sal +(Sal*18/100)
      Fimescolha
      
      Escreva ("O novo sal�rio ser�: R$",Nsal:5:2)






fimalgoritmo
