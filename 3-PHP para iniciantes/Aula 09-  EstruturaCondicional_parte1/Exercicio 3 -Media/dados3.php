<!Doctype html>

<html lang = "pt-br">

	<head>
		<meta charset = "utf-8">

		<?php
			$nota1 = $_POST["nota1"];
			$nota2 = $_POST["nota2"];
			$media = ($nota1 + $nota2) / 2;

			if($media > 7){
				$sit = "aprovado";
				$cor = "green";
			}elseif($media >= 5 && $media <= 7){
				$sit = "recuperação";	
				$cor = "rgb(255,243,13)";
			}else{
				$sit = "Reprovado";
				$cor = "red";
			}


		?>

		<style>
			span.situacao{
				color: <?php echo $cor; ?>;
			}
		</style>

	</head>

	<body>

		<?php

			echo "A média entre $nota1 e $nota2 é <span class = 'media'>$media <span>. </br> ";
			echo "Situação: <span class = 'situacao'> $sit </span>";

		?>		

	</body>

</html>
