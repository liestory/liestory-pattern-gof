package pattern.car.lada.complele;

import pattern.factory.carcase.CarCase;
import pattern.factory.carcase.ColorCar;
import pattern.factory.carcase.NameCar;
import pattern.factory.carcase.TypeCar;

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
