package pattern.car.audi.complele;

import pattern.factory.carcase.CarCase;
import pattern.factory.carcase.ColorCar;
import pattern.factory.carcase.NameCar;
import pattern.factory.carcase.TypeCar;

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
