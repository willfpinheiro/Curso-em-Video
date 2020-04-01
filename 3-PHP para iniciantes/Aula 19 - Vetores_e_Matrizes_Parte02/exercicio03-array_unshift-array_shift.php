<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<pre>
			<?php
				$v = array("A","B","C","D");

				print_r($v);

				array_unshift($v,"L"); //Adicionando elemento no início do vetor
				array_shift($v);	//Deletando elemento no início do vetor

				print_r($v);
			?>
		</pre>

	</body>

</html>