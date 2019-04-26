package com.app.bean.cars;

import com.app.bean.engines.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value = "c")
public class Car {
    @Autowired
    private Engine engine;

    // No need of setter and constrcutor

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                '}';
    }
}
