<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$produto = "leite";
			$preco 	 = 4.5;

			//echo "O $produto esta custando R$ $preco."; 
			printf("O %s esta custando R$ %.2f",$produto,$preco);

			/*
				%d valor decimal(positivo ou negativo)
				%u valor decimal sem sinal(apenas positivos)
				%f valor real
				%s string
			*/
		?>

	</body>

</html>