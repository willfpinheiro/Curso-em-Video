<!-- Aplicar 10% de desconto ao preço de um produto -->
<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			$preco = $_GET["preco"];
			
			echo "O preço do produto é R$ $preco </br>";
			$aumento = $preco + ($preco * 10 / 100);
			echo "O preço com 10 % de aumento é R$".number_format($aumento,2,",",".")." </br>";
			$desc = $preco - ($preco * 10 /100);
			echo "O preço com 10 % de desconto é ".number_format($desc,2,",",".");
		?>

	</body>

</html>