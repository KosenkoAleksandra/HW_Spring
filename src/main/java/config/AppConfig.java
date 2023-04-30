package config;

import HW.spring.Bus;
import HW.spring.Car;
import HW.spring.Driver;
import HW.spring.Pickup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Car getCarBean() {
        return new Car("BMW", "X6");
    }
    @Bean
    public Bus getBusBean() {
        return new Bus("Kia", "Granbird");
    }
    @Bean
    public Pickup getPickupBean() {
        return new Pickup("Hummer", "H2");
    }
    @Bean(name = "driver1")
    public Driver getDriverCar() {
        return new Driver("Ivan" , getCarBean());
    }
    @Bean(name = "driver2")
    public Driver getDriverBus() {
        return new Driver("Petr" , getBusBean());
    }
    @Bean(name = "driver3")
    public Driver getDriverPickup() {
        return new Driver("Semen" , getPickupBean());
    }
}
