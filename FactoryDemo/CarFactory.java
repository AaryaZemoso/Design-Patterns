package FactoryDemo;

public class CarFactory {

    CarFactory() {
    }

    ICar getCar(String type) {
        if ("FactoryDemo.BMW".equals(type))
            return new BMW();
        else
            return new Mercedes();
    }
}
