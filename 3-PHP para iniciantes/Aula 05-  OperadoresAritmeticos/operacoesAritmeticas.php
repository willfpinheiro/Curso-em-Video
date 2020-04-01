<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

	<?php
		$n1 = 3;
		$n2 = 2;
		//$soma  = $n1 + $n2;
		$sub   = $n1 - $n2;
		$mult  = $n1 * $n2;
		$div   = $n1 / $n2;
		$resto = $n1 % $n2;
		$media = ($n1 + $n2) / 2;

		echo "Soma: ".($n1 + $n2)." </br>";
		echo "Subtração: $sub 		</br>";
		echo "Multiplicação: $mult  </br>";
		echo "Divisão: $div         </br>";
		echo "Resto: $resto         </br>";
		echo "Média: $media";
	?>

	</body>

</html>