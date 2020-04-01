algoritmo "Detector de Pesado"
var
   Cont:Inteiro
   Peso,MPeso:Real
   Nome,Pesado:Caractere
   Procedimento Topo ()
   Inicio
         LimpaTela
           Escreval ("--------------------------------------------")
           Escreval ("             DETECTOR DE PESADO             ")
           Escreval ("Maior Peso até agora :",Mpeso," Kg")
           Escreval ("--------------------------------------------")
   FimProcedimento


inicio
      Topo ()
      Para Cont <- 1 ate 5 faca
           Escreva ("Digite o Nome :")
           Leia (Nome)
           Escreva ("Digite o peso de ",Nome," :")
           Leia (Peso)
           Se ( Peso > MPeso ) entao
              Mpeso <- Peso
              Pesado <- Nome
           FimSe
      Topo ()


      FimPara

            LimpaTela
             Escreva ("A pessoa com maior peso foi ",Pesado," com ",Mpeso," Kg")



fimalgoritmo
