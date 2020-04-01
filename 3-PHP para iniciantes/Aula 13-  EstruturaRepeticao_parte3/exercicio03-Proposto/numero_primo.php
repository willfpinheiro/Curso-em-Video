<!Doctype html>

<html lang = "pt-br">

	<head>	
		<meta charset = "utf-8">

		<style>
			span #primo{
				color: <?php echo "green"; ?>;
			}

			span #naoPrimo{
				color: red;
			}
		</style>

	</head>

	<body>

		<?php
			$numero = isset($_GET["numero"]) ? $_GET["numero"] : 0;
			$totMult = 0;

			echo "Analisando o valor $numero ... </br> </br>";
			echo "Valores Mútiplos: ";
			for($i = 1 ; $i <= $numero ; $i++){
				$mult = $numero % $i;
				
				if($mult == 0){
					echo "$i , ";
					$totMult ++; 
				}

			}

			echo "</br>";
			echo "Total de Mútiplos: $totMult </br>";
			echo "Resultado: ";

			if($totMult == 2){
				echo "<span id = 'primo'>É primo.</span>";
			}else{
				echo "<span id = 'naoPrimo'>Não é primo.</span>";
			}

		?>
		
		</br></br>
		<a href = "javascript:history.go(-1)"> Voltar </a>

	</body>

</html>