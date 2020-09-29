package pattern.car.vw.complele;

import pattern.factory.carcase.CarCase;
import pattern.factory.carcase.ColorCar;
import pattern.factory.carcase.NameCar;
import pattern.factory.carcase.TypeCar;

/**
 * @author Asus 29.09.2020
 */
public class VWCarCase implements CarCase {
    @Override
    public NameCar setName() {
        return new VWName();
    }

    @Override
    public ColorCar setColor() {
        return new VwColor();
    }

    @Override
    public TypeCar setType() {
        return new VwType();
    }
}
