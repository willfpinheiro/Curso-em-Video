<?php

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Description of Gafanhoto
 *
 * @author ronan
 */

require_once 'Pessoa.php';

class Gafanhoto extends Pessoa{
    //Atributos
    private $login;
    private $totalAssistido;
    
    //Constutor
    public function __construct($nome,$idade,$sexo,$login){
        parent::__construct($nome,$idade,$sexo); //Chamada ao Construtor de Pessoa
        $this->setLogin($login);
        $this->setTotalAssistido(0);
    }
    
    //Getters and Setters
    function getLogin() {
        return $this->login;
    }

    function getTotalAssistido() {
        return $this->totalAssistido;
    }

    function setLogin($login) {
        $this->login = $login;
    }

    function setTotalAssistido($totalAssistido) {
        $this->totalAssistido = $totalAssistido;
    }

    //Método Específico
    
    public function apresentarGafanhoto(){
        echo "<p> ========= Gafanhoto ========= </p>";
        echo "Nome: {$this->getNome()}   </br>";
        echo "Idade: {$this->getIdade()} </br>";
        echo "Sexo: {$this->getSexo()}   </br>";
        echo "Login:{$this->getLogin()}  </br>";
        echo "Total Assistido: {$this->getTotalAssistido()} </br>";
        echo "Experiência: {$this->getExperiencia()}</br>";
    }
    
    public function viuMaisUm(){
        $this->setTotalAssistido($this->getTotalAssistido() + 1);
    }
    
    //Método Abstrato
    public function ganharExperiencia() {
        $this->setExperiencia($this->getExperiencia() + 1);
    }
}
