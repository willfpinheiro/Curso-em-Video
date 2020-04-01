<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$estados = $_POST["estados"];

			echo "Você mora na ";	

			switch($estados){
				case 1:
					echo "Região Norte.";
					break;
				case 2:
					echo "Região Nordeste.";
					break;
				case 3:
					echo "Região Centro-Oeste.";
					break;
				case 4:
					echo "Região Sudeste.";
					break;
				case 5:
					echo  "Região Sul.";
					break;
			}

		?>

	</body>

</html>