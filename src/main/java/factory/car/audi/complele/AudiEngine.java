package factory.car.audi.complele;

import factory.factory.engine.Engine;
import factory.factory.engine.Power;
import factory.factory.engine.TypeFuel;

/**
 * @author Asus 29.09.2020
 */
public class AudiEngine implements Engine {
    @Override
    public Power setPower() {
        return new AudiPower();
    }

    @Override
    public TypeFuel setTypeFuel() {
        return new AudiTypeFuel();
    }
}
