<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$dia = $_GET["dia"];

			switch($dia){
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
					echo "Estou estudando";
					break;
				case 7:
				case 8:
					echo "Estou descansando";
					break;
				default:
					echo "Dia da semana não existe";
			}
		?>	

		<a href = "javascript:history.go(-1)"> Voltar </a> <!-- Voltando 1 página-->
	
	</body>

</html>