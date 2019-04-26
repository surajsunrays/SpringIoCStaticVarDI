package com.app.test;

import com.app.bean.cars.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Car c = (Car) context.getBean(Car.class);
        String data = c.toString();
        System.out.println(data);
    }
}
