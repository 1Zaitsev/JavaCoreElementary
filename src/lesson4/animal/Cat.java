package lesson4.animal;

public class Cat extends Animal {
    public Cat(String name){
        this.name = name;
        this.maxRunDistance = 200;
        this.maxJumpHeight = 2;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat's don't swim");
    }
}
