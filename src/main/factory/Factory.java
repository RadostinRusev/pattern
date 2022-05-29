package main.factory;

import main.toy.Toy;

public abstract class Factory {

    private String type;


    public abstract Toy create();
}
