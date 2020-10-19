package factory.car.BMW;

import factory.car.BMW.complele.BMWCarCase;
import factory.car.BMW.complele.BMWEngine;
import factory.factory.Car;
import factory.factory.carcase.CarCase;
import factory.factory.engine.Engine;

/**
 * @author Asus 29.09.2020
 */
public class BMW implements Car {
    @Override
    public CarCase getCarCase() {
        return new BMWCarCase();
    }

    @Override
    public Engine getEngine() {
        return new BMWEngine();
    }
}
