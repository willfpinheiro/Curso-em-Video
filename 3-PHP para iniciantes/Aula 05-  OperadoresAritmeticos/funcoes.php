<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$valor_1 = $_GET["x"];
			$valor_2 = $_GET["y"];

			echo "Valor 1: $valor_1 </br>";
			echo "Valor 2: $valor_2 </br> </br>";

			echo "Valor 2 (Absoluto): ".abs($valor_2)."   </br>";
			echo "Valor 1 (Potencia): ".pow($valor_1,2)." </br>";
			echo "Valor 1 (Quadrado): ".sqrt($valor_1)."  </br>";
			echo "Valor 2 (Arredondamento): ".round($valor_2)."</br>";
			echo "Valor 2 (Arr. para Cima): ".ceil($valor_2)."</br>";
			echo "Valor 2 (Arr. para Baixo): ".floor($valor_2)."</br>";
			echo "Valor 2 (Valor Inteiro): ".intval($valor_2)."</br>";
			echo "Valor 1 (Formatação Decimal): ".number_format($valor_1,2,",");


		?>

	</body>

</html>