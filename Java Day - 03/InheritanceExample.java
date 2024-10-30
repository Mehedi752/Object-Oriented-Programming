// This program demonstrates Inheritance in Java.
class Animal {          // Base class
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Derived class
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal {
    void bark() {
        System.out.println("The cat meow.");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        dog.eat();
        dog.bark();

        cat.eat();
        cat.bark();
    }
}