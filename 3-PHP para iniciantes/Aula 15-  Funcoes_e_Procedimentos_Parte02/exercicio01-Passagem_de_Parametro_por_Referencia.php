<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			//Procedimento
			function teste(&$x){ //&$x = Passagem por Referência
				$x += 2;
				echo "</p> O valor de x é $x.</p>"; 
			} 

			$a = 3;
			teste($a);
			echo "</p> O valor de A é $a.</p>";

		?>

	</body>

</html>