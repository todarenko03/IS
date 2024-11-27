package org.example.commands;

import org.example.lift.ILift;

public class MoveUpCommand implements ICommand {
    private final ILift lift;

    public MoveUpCommand(final ILift lift) {
        this.lift = lift;
    }
    @Override
    public void execute() {
        lift.moveUp();
    }
}
