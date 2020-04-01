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
                
                //Instância de Video
                $video_01 = new Video("Trailer 1 - Homem Aranha Homecoming");

                $video_01->setAvaliacao(4);
                $video_01->setViews(250);
                $video_01->like();
                $video_01->play();
                $video_01->pause();
                print_r($video_01);
                
                //Instância de Gafanhoto
                $gaf_01 = new Gafanhoto("Ronan",21,'m',"ronan_J");
                
                $gaf_01->viuMaisUm();
                $gaf_01->ganharExperiencia();
                print_r($gaf_01);
                
            ?>
        </pre>    
    </body>
</html>
