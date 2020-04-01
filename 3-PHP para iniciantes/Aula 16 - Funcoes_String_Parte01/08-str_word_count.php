<?php
	$texto = "Eu vou estudar PHP agora";
	$cont  = str_word_count($texto,0);

	print "$texto </br>";
	print "Palavras: ".($cont);

	/*
		0 : Apenas contar palavras
		1 : Transformar a string em vetor
		2 : Transformar a string em vetor preservando a posição da palavra 
	*/

?>