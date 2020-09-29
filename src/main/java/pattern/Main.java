package pattern;

import pattern.car.BMW.BMW;
import pattern.factory.Car;
import pattern.factory.carcase.CarCase;
import pattern.factory.engine.Engine;

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
