package pattern.car.BMW.complele;

import pattern.factory.engine.Engine;
import pattern.factory.engine.Power;
import pattern.factory.engine.TypeFuel;

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
