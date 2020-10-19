package factory.car.lada.complele;

import factory.factory.engine.Engine;
import factory.factory.engine.Power;
import factory.factory.engine.TypeFuel;

/**
 * @author Asus 29.09.2020
 */
public class LadaEngine implements Engine {
    @Override
    public Power setPower() {
        return new LadaPower();
    }

    @Override
    public TypeFuel setTypeFuel() {
        return new LadaTypeFuel();
    }
}
