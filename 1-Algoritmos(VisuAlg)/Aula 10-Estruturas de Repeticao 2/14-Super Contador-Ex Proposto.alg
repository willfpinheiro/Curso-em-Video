algoritmo "Super Contador"
var
   Cont1,Cont2,Menu:INTEIRO

inicio
Repita
      Cont1 <- 1
      Cont2 <- 10

      Escreval ("")
      Escreval ("======================")
      Escreval ("/        Menu         /")
      Escreval ("======================")
      Escreval ("/ [1] De 1 a 10       /")
      Escreval ("/ [2] De 10 a 1       /")
      Escreval ("/ [3] Sair            /")
      Escreval ("========================")
      Leia (Menu)
      

      Escolha (Menu)

              Caso 1
                   Enquanto (Cont1 <=10)  faca
                            Escreva (Cont1, "...")
                            Cont1 <- Cont1 +1
                   FimEnquanto
              Caso 2
                   Enquanto (Cont2 >= 1) faca
                            Escreva (Cont2, "...")
                            Cont2 <- Cont2 - 1
                   FimEnquanto
              outrocaso
                       Escreva ("SAINDO")


      FimEscolha

Ate (Menu = 3)
fimalgoritmo
