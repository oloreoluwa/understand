class Mains {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.swim();
        dog.play();
        cat.swim();
        cat.play();

    }
}

interface Swimmer {
    void swim();
}

interface Player {
    void play();
}

//implement the Swimmer and the Player interfaces
abstract class Animal{
    abstract void swim();
    abstract void play();
}


class Dog extends Animal {
    //Override the swim() and the play() methods
    @Override
    void swim() {
        System.out.println("Dog is swimming");
    }

    @Override
    void play() {
        System.out.println("Dog is playing");
    }

}


class Cat extends Animal {
    //Override the swim() and the play() methods
    @Override
    void swim() {
        System.out.println("Cat is swimming");
    }

    @Override
    void play() {
        System.out.println("Cat is playing");
    }

}