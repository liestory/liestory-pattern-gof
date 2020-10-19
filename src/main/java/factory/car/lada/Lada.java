package factory.car.lada;

import factory.car.lada.complele.LadaCarCase;
import factory.car.lada.complele.LadaEngine;
import factory.factory.Car;
import factory.factory.carcase.CarCase;
import factory.factory.engine.Engine;

/**
 * @author Asus 29.09.2020
 */
public class Lada implements Car {
    @Override
    public CarCase getCarCase() {
        return new LadaCarCase();
    }

    @Override
    public Engine getEngine() {
        return new LadaEngine();
    }
}
