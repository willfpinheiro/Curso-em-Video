<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$n1 = $_GET["n1"];
			$n2 = $_GET["n2"];
			$op = $_GET["op"];
			
			$res = ($op == "s") ? $n1 + $n2 : $n1 * $n2;

			echo "Os valores passados foram $n1 e $n2 </br>";
			echo "O resultado será $res";
		?>

	</body>

</html>
