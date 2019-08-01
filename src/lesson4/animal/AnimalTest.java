package lesson4.animal;

public class AnimalTest {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Frank");
        Dog dog1 = new Dog("Dream");
        Dog dog2 = new Dog("Holly",700);

        cat1.run(500);
        cat1.run(200);
        cat1.swim(500);
        dog1.jump(0.5f);
        dog1.swim(20);
        dog2.run(700);
        dog1.run(100);
    }
}
