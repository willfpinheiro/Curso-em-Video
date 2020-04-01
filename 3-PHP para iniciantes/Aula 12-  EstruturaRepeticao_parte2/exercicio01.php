<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$cont_1 = 1;
			$cont_2 = 10;

			//Progressivo
			do{
				echo "$cont_1 ";
				$cont_1 += 2;
			}while($cont_1 <= 20);

			echo "</br></br>";

			//Regressivo
			do{
				echo "$cont_2 ";
				$cont_2 -= 2;
			}while($cont_2 >= 1);

		?>

	</body>

</html>