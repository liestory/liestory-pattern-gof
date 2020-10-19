package factory.car.vw.complele;

import factory.factory.carcase.CarCase;
import factory.factory.carcase.ColorCar;
import factory.factory.carcase.NameCar;
import factory.factory.carcase.TypeCar;

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
