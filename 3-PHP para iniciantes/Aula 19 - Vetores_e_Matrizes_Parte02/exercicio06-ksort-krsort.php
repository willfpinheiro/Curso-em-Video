<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<pre>
			<?php
				$alfabeto = array(5 => "T",2 => "A",0 => "D", 3 => "E");

				//ksort($alfabeto);	//Orderna indices(keys) por ordem crescente 

				krsort($alfabeto);//Ordernar indices(keys) por ordem decrescente

				print_r($alfabeto);
			?>
		</pre>


	</body>

</html>