<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Video
 *
 * @author ronan
 */

require_once 'AcoesVideo.php';

class Video implements AcoesVideo{
    //Atributos
    private $titulo;
    private $avaliacao;
    private $views;
    private $curtidas;
    private $reproduzindo;
    
    //Construtor
    public function __construct($titulo){
        $this->setTitulo($titulo);
        //$this->setAvaliacao(0);
        $this->setViews(0);
        $this->setCurtidas(0);
        $this->setReproduzindo(false);
    }
    
    //Getters and Setters
    function getTitulo() {
        return $this->titulo;
    }

    function getAvaliacao() {
        return $this->avaliacao;
    }

    function getViews() {
        return $this->views;
    }

    function getCurtidas() {
        return $this->curtidas;
    }

    function getReproduzindo() {
        return $this->reproduzindo;
    }

    function setTitulo($titulo) {
        $this->titulo = $titulo;
    }

    function setAvaliacao($avaliacao) {
        $media =   $this->getAvaliacao() + $avaliacao  / $this->getViews(); 
        
        $this->avaliacao = $media;
    }

    function setViews($views) {
        $this->views = $views;
    }

    function setCurtidas($cutidas) {
        $this->curtidas = $cutidas;
    }

    function setReproduzindo($reproduzindo) {
        $this->reproduzindo = $reproduzindo;
    }

    
    //Métodos Abstratos
    
    public function apresentarVideo() {
        echo "<p> ========== Video ============ </p>";
        echo "Título: {$this->getTitulo()} </br>";
        echo "Status: {$this->getReproduzindo()} </br>";
        echo "Avaliação: {$this->getAvaliacao()} </br>";
        echo "Views: {$this->getViews()} </br>";
        echo "Curtidas: {$this->getCurtidas()} </br>";
        
    }
    
    public function play() {
        $this->setReproduzindo(true);
    }
    
    public function pause() {
        $this->setReproduzindo(false);
    }
    
    public function like() {
        $this->setCurtidas($this->getCurtidas() + 1);
    }

    

}
