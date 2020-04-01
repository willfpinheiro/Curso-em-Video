algoritmo "Detector de Pesado"
var
   Cont:Inteiro
   Peso,MPeso:Real
   Nome,Pesado:Caractere
inicio
      Para Cont <- 1 ate 5 faca
           LimpaTela
           Escreval("------------------------------------")
           Escreval("        Detector de Pesado          ")
           Escreval ("Maior peso ate agora :",MPeso)
           Escreval("------------------------------------")

           Escreva("Digite o nome: ")
           Leia (Nome)
           Escreva("Digite o peso de ",Nome," : ")
           Leia (Peso)
           
           Se (Peso > MPeso)entao
              MPeso <-Peso
              Pesado <- Nome
              
           FimSe
      FimPara
             LimpaTela
             Escreva ("A pessoa com maior peso é ",Pesado," com ",MPeso,"Kg")
fimalgoritmo
