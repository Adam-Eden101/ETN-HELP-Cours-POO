<?php
class Animal {
    protected $name;
    protected $meal;
    protected $weight;
    protected $age;
    protected $agressivity;
    protected $genre;

    function __construct($name, $meal, $weight, $age, $agressivity) {
        $this->name = $name;
        $this->meal = $meal;
        $this->weight = $weight;
        $this->age = $age;
        $this->agressivity = $agressivity;
        $is_male = rand(0, 1);
        if ($is_male == 1) {
            $this->genre = "male";
        } else {
            $this->genre = "female";
        }
    }

    function inspect() {
        echo("It is a $this->name who eats $this->meal. He is $this->age and weigths $this->weight kg.\n");
    }
};

class Carnivore extends Animal {
    function __construct($name, $weight, $age, $agressivity) {
        parent::__construct($name, "meat", $weight, $age, $agressivity);
    }
}

class Lion extends Carnivore {

    function __construct($weight, $age)
    {
        if ($age > 10) {
            $agressivity = rand(40, 100);
        } else {
            $agressivity = rand(1, 39);
        }

        parent::__construct("lion", $weight, $age, $agressivity);
    }

    function inspect() {
        echo("It is a $this->genre who is at $this->agressivity% agressive. They eat $this->meal. He is $this->age and weigths $this->weight kg.\n");
    }
};
$lion1 = new Lion(200, 15);
$lion2 = new Lion(180, 25);
$lion3 = new Lion(90, 5);

$lion1->inspect();
$lion2->inspect();
$lion3->inspect();
