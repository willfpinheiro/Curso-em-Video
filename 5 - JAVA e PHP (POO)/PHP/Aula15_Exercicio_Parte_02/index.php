<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <pre>
            <?php
                require_once 'Video.php';
                require_once 'Gafanhoto.php';
                require_once 'Visualizacao.php';

                //Instância de Video
                $video[0] = new Video("Transformeres: O último cavaleiro");
                $video[1] = new Video("Homem-Aranha: Homecoming");
                
                $video[0]->apresentarVideo();
                $video[1]->apresentarVideo();
                
                //Instância de Pessoa
                $gaf[0] = new Gafanhoto("Ronan Jordão",21,'m',"ronan_21");
                $gaf[1] = new Gafanhoto("Carol Ferreira",19,'f',"carol_19");
                $gaf[2] = new Gafanhoto("Edison",16,'m',"edison_16");
                
                $gaf[0]->apresentarGafanhoto();
                $gaf[1]->apresentarGafanhoto();
                $gaf[2]->apresentarGafanhoto();
                
                //Instância de Visualizacao
                $vis[0] = new Visualizacao($gaf[0],$video[0]); //Ronan visualiza Transformeres
                $vis[1] = new Visualizacao($gaf[1],$video[0]); //Carol visualiza Transformeres
                $vis[2] = new Visualizacao($gaf[2],$video[0]); //Edison visualiza Homem-Aranha 
                
                $vis[0]->apresentarVisualizacao();
                $vis[0]->avaliar();
                
                $vis[1]->apresentarVisualizacao();
                $vis[1]->avaliarPorcentagem(20);
                
                $vis[2]->apresentarVisualizacao();
                $vis[2]->avaliar();
                
                $gaf[0]->apresentarGafanhoto();
                $gaf[1]->apresentarGafanhoto();
                $gaf[2]->apresentarGafanhoto();
                
                $video[0]->apresentarVideo();
                $video[1]->apresentarVideo();
            ?>
        </pre>    
    </body>
</html>
