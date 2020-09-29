package pattern.car.lada;

import pattern.car.lada.complele.LadaCarCase;
import pattern.car.lada.complele.LadaEngine;
import pattern.factory.Car;
import pattern.factory.carcase.CarCase;
import pattern.factory.engine.Engine;

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
