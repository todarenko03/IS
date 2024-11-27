package org.example.commands;

public class ImpossibleMoveCommand implements ICommand{

    @Override
    public void execute() {
        throw new RuntimeException("Move is impossible because lift go away from possible range");
    }
}
