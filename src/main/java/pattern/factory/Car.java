package pattern.factory;

import pattern.factory.carcase.CarCase;
import pattern.factory.engine.Engine;

/**
 * @author Asus 29.09.2020
 */
public interface Car {

    CarCase getCarCase();

    Engine getEngine();
}
