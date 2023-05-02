package HW.spring;

public class Bus extends Transport{
    public Bus(String brand, String model) {
        super(brand, model);
    }

    public void start() {
        System.out.println(getBrand() + " " + getModel() + " готов к работе");
    }
}
