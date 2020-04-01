<!Doctype html>

<html lang = "pt-br">	

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<pre>
			<?php
				$vetor = array("A","B","C","D","E");

				print_r($vetor);
				
				array_push($vetor,7); //Adicionando elemento no último indice
				array_pop($vetor);    //Excluindo o último elemento do vetor

				
				print_r($vetor);
			?>
		</pre>

	</body>

</html>