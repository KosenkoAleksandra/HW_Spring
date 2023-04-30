package HW.spring;

import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        Driver driver1 = context.getBean("driver1", Driver.class);
        driver1.startTheTransport();
        Driver driver2 = context.getBean("driver2", Driver.class);
        driver2.startTheTransport();
        Driver driver3 = context.getBean("driver3", Driver.class);
        driver3.startTheTransport();


    }
}
