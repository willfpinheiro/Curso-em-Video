<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$inicio = $_GET["valorInicio"];
			$fim 	= $_GET["valorFim"];
			$passo  = $_GET["passo"];
			
			if($inicio <= $fim){
				//Progressivo
				while($inicio <= $fim){
					echo "$inicio ";
					$inicio += $passo;
				}
			}else{
				//Regressivo
				while($inicio >= $fim){
					echo "$inicio ";
					$inicio -= $passo; 
				}
			}

		?>

	</body>

</html>