<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset =  "utf-8">
	</head>

	<body>

		<?php
			$cont_1 = 1;
			$cont_2 = 10;

			while($cont_1 <= 10){
				echo $cont_1." ";
				$cont_1 ++;
			}

			echo "</br>";
			echo "</br>";

			while($cont_2 >= 1){
				echo $cont_2." ";
				$cont_2 -=2;
			}

		?>

	</body>

</html>