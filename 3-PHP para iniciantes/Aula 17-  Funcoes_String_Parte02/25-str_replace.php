<?php
	//Substituição de Strings
	
	$frase = "Gosto de estudar Matemática !!!Matemática é muito legal !";
	$novaFrase = str_ireplace("matemática","PHP",$frase);

	echo $novaFrase;

?>