<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">	
	</head>

	<body>

		<?php
			$numero = $_GET["numero"];
			$cont = 1;
			
			do{
				$res = $numero * $cont;
				echo "$numero X $cont = $res </br>";
				$cont ++;
			}while($cont <= 10);
		?>

	</body>

</html>