<?php
	$nome = "   José da Silva   ";
	$novo = trim($nome);

	echo (strlen($nome))."Com espaços";
	echo ("</br>");
	echo (strlen($novo))."Sem Espaços";

	echo "</br></br> $novo";

	/*
		trim  : Desconsidera espaços no início e no fim da string 
		ltrim : (left)  Desconsidera espaços apenas no início da string
		rtrim : (right) Desconsidera espaços apenas no fim da string
	*/
?>