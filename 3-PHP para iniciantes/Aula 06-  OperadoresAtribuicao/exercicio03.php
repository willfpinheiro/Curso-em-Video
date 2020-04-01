<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$a = 3;
			$b = &$a; //Referênciando valor de B em A
			$b += 5;

			echo "A: $a   </br>";
			echo "B: $b";
		?>

	</body

</html>
