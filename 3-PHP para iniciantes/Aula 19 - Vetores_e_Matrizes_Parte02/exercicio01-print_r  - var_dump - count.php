<!Doctype html>

<html lang = "pt-br">	

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<pre>
			<?php
				$vetor = array("A","B","C","D","E");

				echo "O vetor tem ".count($vetor)." elementos </br></br>";

				print_r($vetor); //Exibição simples do vetor

				echo "</br>";

				var_dump($vetor); //Exibição um pouco mais detalhado
			?>
		</pre>

	</body>	

</html>