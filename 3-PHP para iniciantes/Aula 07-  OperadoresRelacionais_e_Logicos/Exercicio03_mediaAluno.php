<!Doctype html>

<html lang = "pt-br">
	
	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$nota_1 = $_GET["n1"];
			$nota_2 = $_GET["n2"];
			$media = ($nota_1 + $nota_2) / 2 ; 
			

			echo "Nota 1: $nota_1  </br>";
			echo "Nota 2: $nota_2  </br></br>";
			echo "Média: $media	   </br>";
			echo "Situação: ".($media >= 6 ? "Aprovado" : "Reprovado");
		?>

	</body>

</html>