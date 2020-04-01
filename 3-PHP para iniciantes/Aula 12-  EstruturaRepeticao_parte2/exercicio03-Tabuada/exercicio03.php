<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<form method = "GET" action = "dados03.php">
			Número: 
				<select name = "numero">
					<?php
						$cont = 1;

						do{
							echo "<option value = '$cont'> $cont </option>";
							$cont ++;
						}while($cont <= 10);	
							
					?>
				</select>

			<input type = "submit" value = "Tabuada">

		</form>

	</body>

</html>