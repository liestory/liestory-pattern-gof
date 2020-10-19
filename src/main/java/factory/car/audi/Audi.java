package factory.car.audi;

import factory.car.audi.complele.AudiCarCase;
import factory.car.audi.complele.AudiEngine;
import factory.factory.Car;
import factory.factory.carcase.CarCase;
import factory.factory.engine.Engine;

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
