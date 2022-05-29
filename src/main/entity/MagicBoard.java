package main.entity;


import main.observer.Observer;
import main.observer.Observable;

import java.util.LinkedList;
import java.util.List;


public class MagicBoard implements Observable {
    private final List<Observer> subscribers = new LinkedList<>();

    private static MagicBoard instance;

    private WORD word;

    public static MagicBoard getInstance() {

        if(instance == null) {
            instance = new MagicBoard();
        }

        return instance;
    }

    private MagicBoard() {
    }

    @Override
    public void subscribe(final Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(final Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for ( Observer subscriber : subscribers) {
            subscriber.notify(word);
        }
    }


    public void changeWord(WORD word){
        this.word= word;
        this.notifyObservers();
    }

    /*public void changeState(Class<? extends Toy> toy) {
            this.state = toy;
            this.notifySubscribers();
    }

    private void notifySubscribers() {
        for (final Observer subscriber : subscribers) {
            subscriber.notify(state);
        }
    }*/
}
