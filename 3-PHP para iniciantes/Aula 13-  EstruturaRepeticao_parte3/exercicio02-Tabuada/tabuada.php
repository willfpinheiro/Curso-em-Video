<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$numero = isset($_GET["numero"]) ? $_GET["numero"] : 0;

			for($i = 1 ; $i <= 10 ; $i++){
				$res  = $numero * $i;
				echo "$numero x $i = $res </br>";
			}
		?>

		<a href = "javascript:history.go(-1)"> Voltar </a>

	</body>

</html>