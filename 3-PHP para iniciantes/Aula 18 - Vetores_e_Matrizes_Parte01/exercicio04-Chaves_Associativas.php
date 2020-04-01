<?php
	//Chaves Associativas : O indice pode ser identificado por String e o conteúdo entre os indices podem ser diferentes

	$cad = array("nome"  => "Ana",
				 "idade" => 23,
				 "peso"  => 78.5);

	$cad["fuma"] = true; //Adicionando um indice

	//foreach : For especial para vetores
	foreach($cad as $indice => $conteudo){
		echo "O campo [$indice]  e $conteudo . </br>";
	}
	
?>