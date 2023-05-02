package HW.spring;

public class Pickup extends Transport{
    public Pickup(String brand, String model) {
        super(brand, model);
    }

    public void start() {
        System.out.println(getBrand() + " " + getModel() + " готов к работе");
    }
}
