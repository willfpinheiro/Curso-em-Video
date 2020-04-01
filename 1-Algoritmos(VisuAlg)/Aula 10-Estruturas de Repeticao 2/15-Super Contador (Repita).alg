algoritmo "Super Contador"
var
   Cont,Op: Inteiro
inicio
Repita
      Escreval ("")
      Escreval ("====================")
      Escreval ("/        Menu      \")
      Escreval ("====================")
      Escreval ("  [1] De 1 a 10     ")
      Escreval ("  [2] De 10 a 1     ")
      Escreval ("  [3] Sair          ")
      Escreval ("====================")
      Leia (Op)
      
      Escolha (OP)
             Caso 1
                  Cont <- 1
                  Repita
                        Escreva (Cont,"...")
                        Cont <- Cont + 1
                  Ate (Cont > 10)
             
             Caso 2
                  Cont <- 10
                  Repita
                        Escreva (Cont, "...")
                        Cont <- Cont - 1
                  Ate(Cont < 1)
             
             OutroCaso
                      Escreva ("Saindo ...")
      FimEscolha
Ate (Op = 3)
fimalgoritmo
