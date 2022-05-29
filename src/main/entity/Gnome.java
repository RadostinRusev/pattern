package main.entity;

import main.factory.Factory;
import main.factory.FactoryBike;
import main.factory.FactoryDoll;
import main.observer.Observer;
import main.toy.Toy;

public class Gnome implements Observer {

Factory factory;
    @Override
    public void notify(WORD word) {
        if(word==WORD.Bike){
            factory=new FactoryBike();
        }
       else if(word==WORD.DOLL){
            factory=new FactoryDoll();
        }
    }
    public Toy getToyToSanta(){
        return factory.create();
    }

}
