<!Doctype html>

<html lang = "pt-br">
	
	<head>
	</head>

	<body>

		<form method = "GET" action = "dados02.php">
			<?php	
				$cont = 1;
				while($cont <= 5){
					 echo "Valor $cont <input type = 'number' min = '0' max = '100' name = 'valor$cont'> </br></br>";
					$cont ++;
				}
			?>

			</br>
			<input type = "submit" value = "Enviar">

		</form>

	</body>

</html>