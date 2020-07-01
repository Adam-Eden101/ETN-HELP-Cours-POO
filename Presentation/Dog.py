
class Dog:
    def __init__(self):
        self.name = "Beethoven"
        self.race = "St. Bernard"
        self.speed = 2
        self.weigth = 105

    def inspect(self):
        print(f"This is {self.name}, a {self.race}")

    def bark(self):
        print("Woof!")

    def play(self):
        self.speed *= 2

beeth = Dog()

beeth.inspect()
