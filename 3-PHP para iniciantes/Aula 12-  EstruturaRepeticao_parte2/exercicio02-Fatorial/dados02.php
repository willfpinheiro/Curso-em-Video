<!-- FATORIAL -->

<!Doctype html >

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$valor = $_GET["valor"];
			$cont = $valor;
			$fat = 1;

			echo "Calculando Fatorial de $valor: </br></br>";
			do{
				echo "$cont x ";
				$fat *= $cont; // $fat = $fat * $cont;
				$cont --;
			}while($cont >= 1);	

			echo "</br></br> $valor != $fat";
		?>

	</body>

</html>