package lesson5;

public class Bowl {
    private int volume;
    private int foodInside = 0;

    public Bowl(int volume) {
        this.volume = volume;
    }

    public void putInFood(int food) {
        if(food > 0) {
            if ((this.foodInside + food) <= this.volume) {
                this.foodInside += food;
                System.out.println("Вы положили в миску " + food + " еды.\nВ миске " + this.foodInside + " еды.");
            } else if ((this.foodInside + food) > this.volume) {
                this.foodInside = this.volume;
                System.out.println("Миска заполнена полностью.\n В миске " + foodInside + " еды. Остальное рассыпалось");
            }
        }
        else{
            System.err.println("Невозможно положить в миску <= 0 еды");
        }
    }

    public int getFoodInside() {
        return foodInside;
    }

    public int getVolume() {
        return volume;
    }

    public void setFoodInside(int foodInside) {
        this.foodInside = foodInside;
    }

}
