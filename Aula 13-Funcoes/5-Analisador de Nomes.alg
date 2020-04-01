algoritmo "Analisador de Strings"
var
   Nome:Caractere
   Cont: Inteiro
inicio
      Escreva ("Digite o seu Nome: ")
      Leia (Nome)
      Escreva("")
      Escreval ("Total de letras do seu nome: ",Compr (Nome))    //Compr (var)= Numera todas as letras de uma palavra
      Escreval ("Seu nome em maiuscula e : ",Maiusc (Nome))      //Maisc (var)=Transforma a palavra em Mauiuscula
      Escreval ("Seu nome em minusculo é : ",Minusc (Nome))      //Minus (var)=Transforma a palavra em Minuscula
      Escreval ("A primeira letra do seu nome é : ",Copia (Nome,1,1)) //Copia(var,num1,num2)=Indica em qual letra deseja começar (num1) e quantas letras para exibir (num2)
      Escreval ("A última letra do seu nome é : ",Copia (Nome,Compr(Nome),1))
      Escreval("Seu nome tem a letra 'A' na posição : ",Pos ("a",(Nome))) //Pos (letra,var)=Indica a posição de uma letra desejada
      Escreval ("O codigo da letra 'N' é :",Asc("n"))                     // Asc ("letra")=Revela o codigo do caractere
      Escreval ("A letra do codigo 100 é :",Carac(110))                   // Carac(num)=Revela o Caractere do através do Código

      Para Cont <- Compr(Nome) ate 1 passo -1 faca
           Escreva (Copia (Maiusc(Nome),Cont,1))
      FimPara
fimalgoritmo
