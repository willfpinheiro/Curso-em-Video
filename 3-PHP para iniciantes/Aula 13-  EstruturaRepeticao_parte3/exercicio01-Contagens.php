<!Doctype html>

<html lang = "pt-br">
	
	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			//Contagem Progressiva
			for($i = 1;$i <= 10;$i++){
				echo "$i ";
			}

			echo "</br>";

			//Contagem Regressiva
			for($i  = 10;$i >= 1;$i--){
				echo  "$i ";
			}

			echo "</br>";

			//Contagem de 5 em 5 (0 - 50)
			for($i = 0; $i <= 50 ; $i += 5){
				echo "$i ";
			}

			echo "</br>";

			//Contagem de -2 em 2 (20 - 0)
			for($i = 20 ; $i >= 0 ; $i -= 2){
				echo "$i ";
			}


		?>

	</body>

</html>