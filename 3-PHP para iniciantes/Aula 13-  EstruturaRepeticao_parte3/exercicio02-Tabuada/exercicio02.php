<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<form method = "GET" action = "tabuada.php">
			Número: 
			<select name = "numero">
				<?php
					for($i = 1; $i<=10 ; $i ++){
						echo "<option value = '$i'> $i </option>";
					}
				?>
			</select> </br>

			<input type = "submit" value = "Verificar">
		</form>

	</body>

</html>