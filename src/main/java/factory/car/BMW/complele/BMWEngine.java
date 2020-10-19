package factory.car.BMW.complele;

import factory.factory.engine.Engine;
import factory.factory.engine.Power;
import factory.factory.engine.TypeFuel;

/**
 * @author Asus 29.09.2020
 */
public class BMWEngine implements Engine {
    @Override
    public Power setPower() {
        return new BMWPower();
    }

    @Override
    public TypeFuel setTypeFuel() {
        return new BMWTypeFuel();
    }
}
