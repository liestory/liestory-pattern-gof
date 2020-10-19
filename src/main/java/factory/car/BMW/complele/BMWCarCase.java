package factory.car.BMW.complele;

import factory.factory.carcase.CarCase;
import factory.factory.carcase.ColorCar;
import factory.factory.carcase.NameCar;
import factory.factory.carcase.TypeCar;

/**
 * @author Asus 29.09.2020
 */
public class BMWCarCase implements CarCase {
    @Override
    public NameCar setName() {
        return new BMWName();
    }

    @Override
    public ColorCar setColor() {
        return new BMWColor();
    }

    @Override
    public TypeCar setType() {
        return new BMWType();
    }
}
