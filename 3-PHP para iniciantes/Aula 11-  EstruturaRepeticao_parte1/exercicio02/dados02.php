<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			//Armazenar variaveis locais
			$i = 1;

			while($i <= 5){
				$v = "num".$i;
				$url = "valor".$i;
				$$v = isset($_GET[$url]) ? $_GET["$url"] : 0;
				$i ++;
			}

			//Exibição
			$i = 1;
			while($i <= 5){
				$v = "num".$i;
				echo "Valor $i :".$$v." </br>";
				$i ++;
			} // Exibe : $num1 , $num2 , $num3 , $num4 ,$num5

		?>

	</body>

</html>