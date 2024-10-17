package org.example.commands;

import org.example.lift.ILift;
import org.example.sm.Configuration;
import org.example.sm.IState;

import java.util.Objects;

public class OpenDoorsCommand implements ICommand {
    private final ILift lift;
    private final IState state;

    public OpenDoorsCommand(final ILift lift, final IState state) {
        this.lift = lift;
        this.state = state;
    }

    @Override
    public void execute() {
        lift.openDoors(
                Objects.equals(state.getName(), Configuration.DOORS_OPEN_DOWN)
                        || Objects.equals(state.getName(), Configuration.DOORS_CLOSE_DOWN)
        );
    }
}
