package HW.spring;

public class Car extends Transport{
    public Car(String brand, String model) {
        super(brand, model);
    }

    public void start() {
        System.out.println(getBrand() + " " + getModel() + " готов к работе");
    }

}
