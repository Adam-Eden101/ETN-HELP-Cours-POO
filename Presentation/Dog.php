<?php

class Dog {
    private $name;
    private $race;
    private $speed;
    private $weigth;

    function __construct($name, $race) {
        $this->name = $name;
        $this->race = $race;
        $this->speed = rand(1, 5) * 10;
        $this->weigth = rand(80, 120);
    }

    function getName() {
        return $this->name;
    }

    function setName($name) {
        $this->name = $name;
    }

    function getRace() {
        return $this->race;
    }

    function setRace($race) {
        $this->race = $race;
    }

    function inspect() {
        echo("This is $this->name, a $this->race\n");
        echo("He can run at $this->speed km/h, he weigths $this->weigth kg\n");
    }

    function bark() {
        echo("Woof!\n");
    }

    function play() {
        $this->speed *= 2;
    }
}
