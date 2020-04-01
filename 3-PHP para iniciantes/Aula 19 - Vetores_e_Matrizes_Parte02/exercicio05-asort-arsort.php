<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<pre>
			<?php
				$alfabeto = array("X","E","C","W");

				//asort($alfabeto); //Ordenar de modo crescente mas preservando os indices

				arsort($alfabeto); //Ordenar de modo decrescente preservando os indices

				print_r($alfabeto);
			?>
		</pre>

	</body>

</html>