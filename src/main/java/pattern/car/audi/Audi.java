package pattern.car.audi;

import pattern.car.audi.complele.AudiCarCase;
import pattern.car.audi.complele.AudiEngine;
import pattern.factory.Car;
import pattern.factory.carcase.CarCase;
import pattern.factory.engine.Engine;

/**
 * @author Asus 29.09.2020
 */
public class Audi implements Car {
    @Override
    public CarCase getCarCase() {
        return new AudiCarCase();
    }

    @Override
    public Engine getEngine() {
        return new AudiEngine();
    }
}
