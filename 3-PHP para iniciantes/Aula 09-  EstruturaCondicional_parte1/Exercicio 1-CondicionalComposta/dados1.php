<!Doctype html>

<html lang = "pt-br">
	
	<head>
		<meta charset = "utf-8">
	</head>	

	<body>

		<?php
			$anoNasc = isset($_GET["anoNasc"]) ? $_GET["anoNasc"] : "0";
			$idade = date("Y") - $anoNasc;

			if( ($idade >= 18) && ($anoNasc != 0) ){
				$voto = "pode votar";
				$dirigir = "pode dirigir";
			}else{
				$voto = "não pode votar";
				$dirigir = "não pode dirigir";
			}

			echo "Você nasceu em $anoNasc e tem $idade anos portanto você $voto e $dirigir .";

		?>

	</body>

</html>