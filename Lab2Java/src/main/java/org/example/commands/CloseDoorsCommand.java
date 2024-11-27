package org.example.commands;

import org.example.lift.ILift;

public class CloseDoorsCommand implements ICommand {
    private final ILift lift;

    public CloseDoorsCommand(final ILift lift) {
        this.lift = lift;
    }
    @Override
    public void execute() {
        lift.closeDoors();
    }
}
