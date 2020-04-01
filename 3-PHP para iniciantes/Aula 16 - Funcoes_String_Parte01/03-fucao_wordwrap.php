<?php
	$texto = "Aqui temos um texto gingante criado pelo PHP e vai mostrar o funcionamento da função wordwrap";
	$res = wordwrap($texto, 20,"</br>\n",false);

	echo $res;
?>