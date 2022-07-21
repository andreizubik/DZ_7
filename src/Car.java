import java.util.Random;

public class Car {
    public int Speed;
    public int Cost;
    static String Brand;

    public Car(int speed, int cost, String brand) {
        Speed = speed;
        Cost = cost;
        Brand = brand;
    }
    public Car() {

    }

    public int getSpeed() {
        return Speed;
    }

    public int getCost() {
        return Cost;
    }

    public String getModel() {
        return Brand;
    }

    public void setSpeed(int speed) {
        this.Speed = speed;
    }

    public void setCost(int cost) {
        this.Cost = cost;
    }

    public void setModel(String model) {
        this.Brand = model;
    }

    public static void startEngine() {
        try {
            offEngine();
            System.out.println("Автомобиль марки " + Brand + " завелся");
        } catch (Except e) {
            e.printStackTrace();
        }

    }
    public static void offEngine() throws Except {
        Random random = new Random();
        int x = random.nextInt(20);
        if (x%2==0) {
            throw new Except ("Exception");
        }
    }
}
