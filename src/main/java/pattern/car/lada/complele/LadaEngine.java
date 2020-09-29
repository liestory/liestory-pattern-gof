package pattern.car.lada.complele;

import pattern.factory.engine.Engine;
import pattern.factory.engine.Power;
import pattern.factory.engine.TypeFuel;

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
