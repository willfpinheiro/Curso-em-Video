algoritmo "IMC"
var
      Alt,Peso,IMC: Real
inicio
      Escreva ("Digite a sua altura (M): ")
      Leia (Alt)
      Escreva ("Digite o seu peso (Kg): ")
      Leia (Peso)
      IMC <- peso / Alt ^ 2
      Se (IMC >=18.5 ) e (IMC <=25) entao
         Escreva ("Parab�ns! O valor de seu IMC � ",IMC:4:2," portanto voc� est� no seu peso ideal")
      Senao
           Escreva("O valor de seu IMC � ",IMC:4:2," portanto voc� N�O est� no seu peso ideal")
      FimSe
fimalgoritmo
