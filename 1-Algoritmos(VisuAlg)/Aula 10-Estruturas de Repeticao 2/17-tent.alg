algoritmo "Conte Até 10 (Repita)"
var
   Cont,In,Final:Inteiro

inicio

      Escreva ("Inicio")
      Leia (In)
      Cont <- In
      Escreva ("Final")
      Leia (Final)
      
      Repita
            Se (In < Final) entao
               Cont <- Cont + 1
            Senao
               Cont <- Cont - 1
            FimSe
      Escreva (Cont)
            
      Ate (Cont < Cont)

fimalgoritmo
