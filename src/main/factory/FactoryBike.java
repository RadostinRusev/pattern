package main.factory;

import main.toy.BikeToy;
import main.toy.Toy;

public class FactoryBike extends Factory{
    @Override
    public Toy create() {
        return new BikeToy();
    }
}
