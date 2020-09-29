package pattern.car.audi.complele;

import pattern.factory.engine.Engine;
import pattern.factory.engine.Power;
import pattern.factory.engine.TypeFuel;

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
