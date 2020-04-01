<!Doctype html>

<html lang = "pt-br">
	
	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$anoNasc = $_GET["anoNasc"];
			$idade = date("Y") - $anoNasc;

			if($idade < 16){
				$voto = "proibido";
			}elseif( ($idade >= 16 and $idade < 18) or ($idade > 65) ){
				$voto = "opcional";
			}else{
				$voto = "obrigatório";
			}
			

			echo "Você tem $idade anos e seu voto é $voto .";

		?>	


	</body>

</html>