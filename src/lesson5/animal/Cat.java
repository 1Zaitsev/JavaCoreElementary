package lesson5.animal;

import lesson5.Bowl;

public class Cat extends Animal {
    private int appetite;
    private boolean isFull = false;

    public Cat(String name, int appetite){
        this.name = name;
        this.maxRunDistance = 200;
        this.maxJumpHeight = 2;
        this.appetite = appetite;
    }

    public boolean isFull() {
        return isFull;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat's don't swim");
    }

    public void eat (Bowl bowl){
        if(this.appetite <= bowl.getFoodInside()){
            bowl.setFoodInside(bowl.getFoodInside() - this.appetite);
            System.out.println(this.getName() + " съел из миски " + this.appetite + ".\nВ миске осталось " + bowl.getFoodInside() + " корма.\n");
            this.isFull = true;
        }else{
            System.err.println("В миске недостаточно еды!");
            bowl.setFoodInside(bowl.getVolume());
        }
    }
}
