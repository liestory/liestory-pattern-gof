package factory.factory;

import factory.factory.carcase.CarCase;
import factory.factory.engine.Engine;

/**
 * @author Asus 29.09.2020
 */
public interface Car {

    CarCase getCarCase();

    Engine getEngine();
}
