<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			//Procedimento (Sem Retorno)
			function soma($a,$b){
				$soma = $a + $b;
				echo "<p> Soma: $soma </p>"; 
			}

			//Programa Principal
			soma(3,2);
			soma(5,5);
			$x = 10;
			$y = 5;
			soma($x,$y);
		?>


	</body>

</html>