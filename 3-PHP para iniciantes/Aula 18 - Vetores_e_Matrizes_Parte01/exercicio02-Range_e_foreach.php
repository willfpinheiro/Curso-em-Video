<!Dotype html>	

<html lang = "pt-br">
	
	<head>
		<meta charset = "utf-8">
	</head>

	<body>
		<table border = "1"> <tr>
			<?php
				//foreach Para cada elemento do vetor
				$c = range(5,20,2);

				//print_r($c);
				//echo "</br></br>";

				foreach($c as $valor){
					echo "<td> $valor ";
				}
			?>
		</tr></table>

	</body>

</html>