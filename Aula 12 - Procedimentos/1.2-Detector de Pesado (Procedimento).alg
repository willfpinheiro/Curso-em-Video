algoritmo "Detector de Pesado"
var
   Cont:Inteiro
   Peso,MPeso:Real
   Nome,Pesado:Caractere
   Procedimento Topo ()
   Inicio
      LimpaTela
           Escreval("------------------------------------")
           Escreval("        Detector de Pesado          ")
           Escreval ("Maior peso ate agora :",MPeso)
           Escreval("------------------------------------")
           Escreva("Digite o nome: ")
           Leia (Nome)
           Escreva("Digite o peso de ",Nome," : ")
           Leia (Peso)
   FimProcedimento
inicio


      Para Cont <- 1 ate 5 faca
      Topo ()

           Se (Peso > MPeso)entao
              MPeso <-Peso
              Pesado <- Nome
           FimSe
      FimPara

           Topo ()
           Escreva ("")
           Escreva ("A pessoa com maior peso é ",Pesado," com ",MPeso,"Kg")
fimalgoritmo
