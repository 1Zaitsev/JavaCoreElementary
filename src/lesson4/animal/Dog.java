package lesson4.animal;

public class Dog extends Animal {

    public Dog(String name){
        this.name = name;
        this. maxRunDistance = 500;
        this.maxSwimDistance = 10;
        this. maxJumpHeight = 0.5f;
    }

    public Dog(String name, int maxRunDistance){
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = 10;
        this. maxJumpHeight = 0.5f;
    }
}
