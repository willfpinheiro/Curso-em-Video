<!-- Mostrar qual foi o ano anterior -->
<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$anoAtual = $_GET["anoAtual"];

			echo "Ano Atual :   $anoAtual </br>";
			echo "Ano Anterior: ".--$anoAtual;    //Pré - Incremento 
			
			// Esse é um comemtário de 1 linha
			# Esse é um Comentario de 1 linha

			/*
				Comentário de multiplas linhas
			*/
		?>

	</body>

</html>