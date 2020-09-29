package pattern.car.BMW;

import pattern.car.BMW.complele.BMWCarCase;
import pattern.car.BMW.complele.BMWEngine;
import pattern.factory.Car;
import pattern.factory.carcase.CarCase;
import pattern.factory.engine.Engine;

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
