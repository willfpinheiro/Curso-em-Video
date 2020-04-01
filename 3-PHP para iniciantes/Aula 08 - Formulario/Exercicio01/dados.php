<!Doctype html>

<html lang = "pt-br" >

	<head>
		<meta charset = "utf-8">
	</head>	

	<body>
		<?php
			$valor = $_GET["valor"];
			$raiz = sqrt($valor);
			echo "A raiz quadrada de $valor é ".number_format($raiz,2);
		?>
	</body>

</html>