package ExtendAnimalHierachy;

public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();
        Bird bird = new Bird("chirp");

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        bird.fly();
    }

    String sound;

    public Animal() {}

    public Animal(String sound) {
        this.sound = sound;
    }

    public void makeSound() {
        System.out.println("Animal Sounds");
    }

}
 class Dog extends Animal {

    @Override

    public void makeSound() {
        System.out.println("woohw woohw");
    }
 }

class Cat extends Animal {

    @Override

    public void makeSound() {
        System.out.println("miauuu miauuu");
    }
}

class Bird extends Animal {

    public Bird(String sound) {
        super(sound);
    }

    @Override

    public void makeSound() {
        System.out.println("chirp chirp");
    }

    public void fly(){
        System.out.println("flying");
    }
}
