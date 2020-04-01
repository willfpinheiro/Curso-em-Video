algoritmo "Triângulo"
var

   l1,l2,l3:real
   EQ,ES,TRI:logico
inicio
      Escreva("Digite o primeiro lado: ")
      Leia (l1)
      Escreva("Digite o segundo lado: ")
      Leia (l2)
      Escreva("Digite o terceiro lado: ")
      Leia (l3)
           TRI<- ((l1<l2+l3)e(l2<l1+l3)e(l3<l2+l1))
           EQ <- ((l1=l2)e(l2=l3))
           ES <- ((l1<>l2)e(l2<>l3)e(l1<>l3))
      Escreval ("Pode formar um Triângulo",TRI )
      Escreval ("O triângulo é Equilatero : ",EQ)
      Escreva ("O triâgulo é Escaleno: ",ES)

fimalgoritmo
