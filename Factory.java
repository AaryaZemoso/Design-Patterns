interface ICar{
    void start();
}

class BMW extends ICar{
    void start()
    {
        System.out.println("Starting BMW");
    }
}

class Mercedes extends ICar{
    void start()
    {
        System.out.println("Starting Mercedes");
    }
}

class CarFactory{
    static CarFactory factory;
    private CarFactory(){}
    static CarFactory getInstance()
    {
        if(factory == null) factory = new CarFactory();
        return CarFactory();
    }

    ICar getCar(String type)
    {
        if("BMW".equals(type))
            return new BMW();
        else
            return new Mercedes();
    }
}

class Main{
    public static void main(String[] args) {
        BMW bmwCar = (BMW)CarFactory.getInstance().getCar("BMW");
        bmwCar.start();
    }
}