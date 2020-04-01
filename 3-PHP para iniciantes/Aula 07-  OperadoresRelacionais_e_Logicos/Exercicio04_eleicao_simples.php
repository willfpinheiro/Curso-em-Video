<!-- Mostrar se um eleitor é obrigado a votar ou não -->

<!Doctype html>

<html lang = "pt-br">
	
	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$anoNasc = $_GET["ano"];
			$idade = 2016 - $anoNasc;
			$tipo_voto = (($idade >= 18) and ($idade < 65)) ? "Obrigatório" : "Não Obrigatório";

			echo "Idade: $idade </br>";
			echo "Voto: $tipo_voto";
		?>	

	</body>

</html>