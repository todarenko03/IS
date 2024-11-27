package org.example.commands;

import org.example.lift.ILift;

public class MoveDownCommand implements ICommand {
    private final ILift lift;

    public MoveDownCommand(final ILift lift) {
        this.lift = lift;
    }
    @Override
    public void execute() {
        lift.moveDown();
    }
}
