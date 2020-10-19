package factory;

import factory.car.BMW.BMW;
import factory.factory.Car;
import factory.factory.carcase.CarCase;
import factory.factory.engine.Engine;

/**
 * @author nemykin 29.09.2020
 */
public class Main {
    public static void main(String[] args) {

        Car car = new BMW();

        CarCase carCase = car.getCarCase();
        Engine engine = car.getEngine();
    }
}
