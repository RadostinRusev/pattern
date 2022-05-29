package main.command;

import main.entity.MagicBoard;
import main.entity.WORD;
import main.toy.BikeToy;

public class CommandMakeBike implements Command {
    @Override
    public void execute() {
        System.out.println(" I need bikes");
        MagicBoard.getInstance().changeWord(WORD.Bike);
    }
}
