package factory.car.lada.complele;

import factory.factory.carcase.CarCase;
import factory.factory.carcase.ColorCar;
import factory.factory.carcase.NameCar;
import factory.factory.carcase.TypeCar;

/**
 * @author Asus 29.09.2020
 */
public class LadaCarCase implements CarCase {
    @Override
    public NameCar setName() {
        return new LadaName();
    }

    @Override
    public ColorCar setColor() {
        return new LadaColor();
    }

    @Override
    public TypeCar setType() {
        return new LadaType();
    }
}
