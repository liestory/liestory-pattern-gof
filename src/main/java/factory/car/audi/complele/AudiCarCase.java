package factory.car.audi.complele;

import factory.factory.carcase.CarCase;
import factory.factory.carcase.ColorCar;
import factory.factory.carcase.NameCar;
import factory.factory.carcase.TypeCar;

/**
 * @author Asus 29.09.2020
 */
public class AudiCarCase implements CarCase {
    @Override
    public NameCar setName() {
        return new AudiName();
    }

    @Override
    public ColorCar setColor() {
        return new AudiColor();
    }

    @Override
    public TypeCar setType() {
        return new AudiType();
    }
}
