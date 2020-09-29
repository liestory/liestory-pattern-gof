package pattern.car.BMW.complele;

import pattern.factory.carcase.CarCase;
import pattern.factory.carcase.ColorCar;
import pattern.factory.carcase.NameCar;
import pattern.factory.carcase.TypeCar;

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
