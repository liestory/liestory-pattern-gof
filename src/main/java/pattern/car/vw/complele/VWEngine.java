package pattern.car.vw.complele;

import pattern.factory.engine.Engine;
import pattern.factory.engine.Power;
import pattern.factory.engine.TypeFuel;

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
