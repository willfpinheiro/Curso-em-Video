algoritmo "Calculo completo IMC"
var
   M,A,IMC:real
   Situacao: Caractere
inicio
      Escreval ("----------------------")
      Escreval ("   Cálculo de IMC      ")
      Escreval ("----------------------")
      Escreva ("Digite o seu peso  (Kg): ")
      Leia (M)
      Escreva ("Digite a sua altura(M): ")
      Leia (A)
           IMC <- M / A^2

      Se (IMC < 17) entao
         Situacao <- ("Muito Abaixo do Peso") entao
      Senao
           Se (IMC >= 17) e (IMC <18.5) entao
              Situacao <-("Abaixo do Peso")
           Senao
                Se(IMC >=18.5) e (IMC <25) entao
                       Situacao <- ("Peso Ideal")
                Senao
                     Se (IMC >= 25) e (IMC < 30 ) entao
                        Situacao <- ("Sobrepeso")
                     Senao
                          Se (IMC >=30) e(IMC < 35) entao
                             Situacao <- ("Obesidade")
                          Senao
                               Se (IMC >= 35) e (IMC < 40) entao
                                  Situacao <- ("Obesidade Severa")
                               Senao
                                    Situacao <- ("Obesidade Mórbida")

                               Fimse
                          Fimse
                     Fimse
                Fimse
           Fimse
      Fimse
      
      Escreval ("====================")
      Escreval ("       Status       ")
      Escreval ("====================")
      Escreval ("IMC:",IMC:4:2)
      Escreva ("Situação:",Situacao)






fimalgoritmo
