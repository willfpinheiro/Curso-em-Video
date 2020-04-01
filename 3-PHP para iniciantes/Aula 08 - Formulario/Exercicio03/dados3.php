<!Doctype html>

<html lang = "pt-br">

	<head>
		<?php
			$txt = isset($_GET["texto"]) ? $_GET["texto"] : "Texto";
			$tam = isset($_GET["tamanho"]) ? $_GET["tamanho"] : "12";
			$cor = isset($_GET["cor"]) ? $_GET["cor"] : "#000000";
		?>

		<style>
			span.texto{
				font-size: <?php echo $tam; ?> ;
				color: <?php echo $cor; ?>;
			}
		</style>	

		<meta charset = "utf-8">
	</head>

	<body>

		<?php
			echo "<span class = 'texto'>$txt</span>";
		?>
	
	</body>

</html>