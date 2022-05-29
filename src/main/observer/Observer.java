package main.observer;


import main.entity.WORD;
import main.toy.Toy;

public interface Observer {
     void notify(WORD word);
}
