package main;

import main.entity.Gnome;
import main.entity.MagicBoard;
import main.entity.SantaClaus;
import main.toy.BikeToy;
import main.toy.DollToy;
import main.toy.Toy;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        MagicBoard magicBoard = MagicBoard.getInstance();
        Gnome gnome = new Gnome();
        magicBoard.subscribe(gnome);
        SantaClaus santa = SantaClaus.getInstance();
        santa.makeToys();

        Toy toy = gnome.getToyToSanta();



        if(toy instanceof BikeToy){
            System.out.println("djudjeto nosi kolelolo");
        }

        if(toy instanceof DollToy){
            System.out.println("djudjeto nosi kukla");
        }
    }
}