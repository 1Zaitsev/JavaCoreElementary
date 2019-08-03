package lesson5;


import lesson5.animal.Cat;

public class Main {
    public static void main(String[] args) {
        Bowl bowl = new Bowl(800);
        bowl.setFoodInside(800);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Space", 300);
        cats[1] = new Cat("Frank" , 400);
        cats[2] = new Cat("Pudge", 700);
        cats[3] = new Cat("Three", 200);
        cats[4] = new Cat("Last", 500);

        for (int i = 0; i <cats.length ; i++) {
            cats[i].eat(bowl);
        }

        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i].getName() +" сыт: " + cats[i].isFull());
        }
    }
}
