<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			function soma(){
				$p = func_get_args();   //Vetor
				$tot = func_num_args(); //Quantidade de Argumentos
				$soma = 0;

				for($i = 0 ; $i < $tot ; $i++){
					$soma = $soma + $p[$i]; 
				}

				return $soma; 
			}

			//Programa Principal
			$res = soma(5,5,10);
			echo "Soma : $res"
		?>

	</body>

</html>