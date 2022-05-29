package main.factory;

import main.toy.DollToy;
import main.toy.Toy;

public class FactoryDoll extends Factory{
    @Override
    public Toy create() {
        return new DollToy();
    }
}
