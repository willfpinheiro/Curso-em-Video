<?php
	//Personalizar Indices dos Vetores
	$v = array(3 => "A" , 8 => "B" , 5 => "C" , 7 => "D");
	$v[] = "E"; //Adicionando outro indice com valor

	unset($v[9]);

	print_r($v);
?>