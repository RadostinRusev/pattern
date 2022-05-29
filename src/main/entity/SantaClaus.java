package main.entity;

import main.command.Command;
import main.command.CommandMakeBike;
import main.command.CommandMakeDoll;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class SantaClaus {
    final Random random = new Random();

    private static SantaClaus instance;

    private SantaClaus() {
    }

    public static SantaClaus getInstance() {

        if(instance == null) {
            instance = new SantaClaus();
        }

        return instance;
    }
    public void makeToys() {
        System.out.println("Good morning! Time to make toys!");
    thinkOfToy().execute();

}

    private Command thinkOfToy() {
        if (random.nextInt(100) > 50) {
            return new CommandMakeBike();
        }
        return new CommandMakeDoll();
    }
}
