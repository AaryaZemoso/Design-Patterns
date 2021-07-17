package FactoryDemo;

public class Main1{
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        BMW bmwCar = (BMW)factory.getCar("FactoryDemo.BMW");
        bmwCar.start();
    }
}