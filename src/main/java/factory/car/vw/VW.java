package factory.car.vw;

import factory.car.vw.complele.VWCarCase;
import factory.car.vw.complele.VWEngine;
import factory.factory.Car;
import factory.factory.carcase.CarCase;
import factory.factory.engine.Engine;

/**
 * @author Asus 29.09.2020
 */
public class VW implements Car {
    @Override
    public CarCase getCarCase() {
        return new VWCarCase();
    }

    @Override
    public Engine getEngine() {
        return new VWEngine();
    }
}
