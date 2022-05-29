package main.command;

import main.entity.MagicBoard;
import main.entity.WORD;
import main.toy.DollToy;

public class CommandMakeDoll implements Command {

    @Override
    public void execute() {
        System.out.println(" I need dolls");
        MagicBoard.getInstance().changeWord(WORD.DOLL);
    }
}
