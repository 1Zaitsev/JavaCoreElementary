package lesson5.animal;

public class Animal {
    String name;
    int maxRunDistance;
    int maxSwimDistance;
    float maxJumpHeight;

    public void run(int distance){
        boolean result = distance <= this.maxRunDistance;
        System.out.println(this.name + " run " + distance +" : " + result);
    }

    public void swim(int distance){
        boolean result = distance <= this.maxSwimDistance;
        System.out.println(this.name + " swim " + distance +" : "+ result);
    }

    public void jump(float heigth){
        boolean result = heigth <= this.maxJumpHeight;
        System.out.println(this.name + " jump height " + heigth + " : " + result);

    }

    public String getName() {
        return name;
    }
}

