<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$num = $_GET["num"];
			$op  = $_GET["operacao"];

			echo "O número digitado foi $num.</br>";

			switch($op){
				case 1:
					echo "O dobro de $num é ".($num * 2);
					break;
				case 2:
					echo "O cubo de $num é ".($num ^ 3);
					break;
				case 3:
					echo "A Raiz Quadrada de $num é ".sqrt($num);
					break;
			}

		?>

		</br>
		<a href = "exercicio01-switch.html"> Voltar </a>

	</body>

</html>