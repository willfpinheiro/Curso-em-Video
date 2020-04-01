<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Visualizacao
 *
 * @author ronan
 */

require_once 'Gafanhoto.php';
require_once 'Pessoa.php';

class Visualizacao {
    //Atributos
    private $espectador; //instância Gafanhoto
    private $filme;      //instância Video   
    
    //Construtor
    public function __construct($gafanhoto,$video){
        $this->setFilme($video);
        $this->setEspectador($gafanhoto);
        $this->espectador->viuMaisUm();
        $this->filme->setViews($this->filme->getViews() + 1);
    }
    
    //Getters and Setters 
    function getEspectador() {
        return $this->espectador;
    }

    function getFilme() {
        return $this->filme;
    }

    function setEspectador($espectador) {
        $this->espectador = $espectador;
    }

    function setFilme($filme) {
        $this->filme = $filme;
    }

    //Método Específico
    
    public function apresentarVisualizacao(){
        echo "<p> ========= Visualização ========== </p>";
        echo "Espectador: {$this->getEspectador()->getNome()}</br>";
        echo "Assistindo: {$this->getFilme()->getTitulo()} </br>";
    }
    
    //Métodos de Sobrecarga
    
    public function avaliar(){
       $this->filme->setAvaliacao(5);
    }
    
    public function avaliarNota($nota){
        $this->filme->setAvaliacao($nota);
    }
    
    public function avaliarPorcentagem($porcentagem){
        $nota = 0;
        
        if($porcentagem <= 20){
            $nota = 3;
        }elseif($porcentagem <= 50){
            $nota = 5;
        }elseif($porcentagem <= 90){
            $nota = 8;
        }else{
            $nota = 10;
        }
         
        $this->filme->setAvaliacao($nota);
       
    }

}
