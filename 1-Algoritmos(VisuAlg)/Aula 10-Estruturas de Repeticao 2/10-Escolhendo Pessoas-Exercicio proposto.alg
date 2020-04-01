algoritmo "Seletor de Pessoas"
var
   Idade,Cabelo,ContM,ContF:Inteiro
   Sexo,Resp: Caractere
inicio
Repita

      Escreval ("======================")
      Escreval ("  Seletor de Pessoas  ")
      Escreval ("======================")
      Escreva ("Qual o sexo ? [M/F] ")
              Leia (Sexo)
      Escreva ("Qual a idade ? ")
              Leia (Idade)
      Escreval ("Qual a cor do cabelo ?")

      Escreval ("_ _ _ _ _ _ _ _ _ _ _")
      Escreval  (" [1] Preto")
      Escreval  (" [2] Castanho")
      Escreval  (" [3] Loiro ")
      Escreval (" [4] Ruivo")
              Leia (Cabelo)
      Escreva ("Deseja Continuar :")
              Leia (Resp)
      LimpaTela
               Se (Sexo = "M")e (Idade > 18) e (Cabelo = 2)  entao
                  ContM <- ContM + 1
               Fimse

               Se (Sexo = "F") e ( (Idade >=25) e (Idade <=30)) e (Cabelo = 3)  entao
                  ContF <- ContF + 1
               Fimse
Ate (Resp = "N")

    Escreval("----------------")
    Escreval("   Resultado    ")
    Escreval("----------------")
    Escreval ("")
    Escreval ("O total de Homens com mais de 18 anos e cabelos castanhos : ",ContM)
    Escreval ("O total de Mulheres entre 25 e 30 anos e cabelos loiros : ",ContF)
    

      
fimalgoritmo
