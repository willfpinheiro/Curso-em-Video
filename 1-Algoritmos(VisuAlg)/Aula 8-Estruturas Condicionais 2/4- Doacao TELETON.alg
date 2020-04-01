algoritmo "TELETON"
var
   D,Valor:real
inicio
      Escreval ("===========================")
      Escreval ("      Doações TELETON      ")
      Escreval ("===========================")
      Escreval ("Digite: ")
      Escreval ("(1) para doar R$10,00")
      Escreval ("(2) para doar R$25,00")
      Escreval ("(3) para doar R$35,00")
      Escreval ("(4) para doar outros valores")
      Escreval ("(5) para cancelar a doação")
      Leia(D)
      
      Escolha (D)
              caso 1
                   Valor <- 10

              Caso 2
                   Valor <- 25
              Caso 3
                   Valor <- 35
              Caso 4
                   Escreva("Qual o valor que você deseja doar? R$")
                   Leia (Valor)

              Caso 5
                   Valor <- 0
              
      Fimescolha
      
      Escreval (-------------------------------)
      Escreval (     "Você doou R$",Valor:5:2)
      Escreval (-------------------------------)
      





fimalgoritmo
