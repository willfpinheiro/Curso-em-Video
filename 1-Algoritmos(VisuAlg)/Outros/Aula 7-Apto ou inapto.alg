algoritmo "Apto ou Inapto"
var
   ano_nasc,ano_atual,ID:inteiro
inicio
      Escreval ("------------------------")
      Escreval ("Departamento de Tr�nsito")
      Escreval  ("------------------------")
      Escreva ("Ano Atual: ")
      Leia (ano_atual)
      Escreva ("Ano de nascimento: ")
      Leia (ano_nasc)
              ID <- ano_atual-ano_nasc
      Escreval ("-------------------")
      Escreval ("      Status       ")
      Escreval ("-------------------")
      Escreval ("IDADE: ",ID)

              se(ID < 18) entao
              Escreval ("Voce � menor de idade.Portanto voc� n�o poder� tirar a CNH ")
                    senao
              Escreva ("Voc� est� apto a tirar a CNH ")


              fimse


fimalgoritmo
