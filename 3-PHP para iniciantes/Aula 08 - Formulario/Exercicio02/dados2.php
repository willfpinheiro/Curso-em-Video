<!Doctype html>

<html lang = "pt-br">	

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$nome = 	isset($_GET["nome"]) 	  ? $_GET["nome"] : "Não Informado" ;
			$ano_Nasc = isset ($_GET["ano_nasc"]) ? $_GET["ano_nasc"] : "0";
			$sexo = 	isset($_GET["sexo"]) 	  ? $_GET["sexo"] : "Não Informado";
			$idade = 	date("Y") - $ano_Nasc;

			echo "Nome: $nome  </br>";
			echo "Ano de Nascimento: $ano_Nasc </br>";
			echo "Sexo : $sexo </br>";
			echo "Idade: $idade";
		?>

	</body>

</html>	