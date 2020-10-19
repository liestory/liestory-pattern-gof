package factory.car.vw.complele;

import factory.factory.engine.Engine;
import factory.factory.engine.Power;
import factory.factory.engine.TypeFuel;

/**
 * @author Asus 29.09.2020
 */
public class VWEngine implements Engine {
    @Override
    public Power setPower() {
        return new VwPower();
    }

    @Override
    public TypeFuel setTypeFuel() {
        return new VwTypeFuel();
    }
}
