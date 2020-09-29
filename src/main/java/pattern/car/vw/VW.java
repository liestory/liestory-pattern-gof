package pattern.car.vw;

import pattern.car.vw.complele.VWCarCase;
import pattern.car.vw.complele.VWEngine;
import pattern.factory.Car;
import pattern.factory.carcase.CarCase;
import pattern.factory.engine.Engine;

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
