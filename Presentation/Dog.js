
class Dog {
    constructor(name, race, speed, weigth) {
        this.name = name;
        this.race = race;
        this.speed = speed;
        this.weigth = weigth;
    }

    play() {
        console.log("We are playing")
    }
}

var beeth = new Dog("Beethoven", "St. Bernard", 2, 105);

beeth.play()