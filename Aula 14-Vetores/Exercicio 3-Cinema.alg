algoritmo "Reserva cadeira"
var
   B:vetor [1..10] de Caractere
   cad,Cont:Inteiro
   Resp:Caractere
   
   Procedimento MostrarFileira ()
   Var
      i:Inteiro
   Inicio
         Para i <- 1 ate 10 faca
              Se (B[i] = "") entao
                 Escreva ("[ B",i," ]")
              Senao
                   Escreva ("[-------]")
              FimSe
         FimPara
         Escreval()
         Escreval ("--------------------------------------------------------------")
   FimProcedimento

inicio
      Repita
            Limpatela
            MostrarFileira
            Escreva ("Reservar a cadeira : B")
            Leia (cad)
            Se (B[cad] = "") entao
               Escreval ("Cadeira B",cad," RESERVADA!")
               B[cad] <- "X"
            Senao
                 Escreval("Erro: Lugar Ocupado !")
            FimSE
            

            Escreva("Deseja reservar outro lugar? [S/N] ")
            Leia (Resp)
      Ate(Resp = "N")
fimalgoritmo
