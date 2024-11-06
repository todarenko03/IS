package org.example.sm;

import org.example.commands.*;
import org.example.lift.ILift;

import java.util.ArrayList;

public class Configuration {
    private final ICommandRepository commands;
    private final IStateTransitions transitions;

    public static final String DOORS_OPEN_UP = "DOORS_OPEN_UP";
    public static final String DOORS_OPEN_DOWN = "DOORS_OPEN_DOWN";
    public static final String DOORS_CLOSE_UP = "DOORS_CLOSE_UP";
    public static final String DOORS_CLOSE_EMPTY = "DOORS_CLOSE_EMPTY";
    public static final String DOORS_CLOSE_DOWN = "DOORS_CLOSE_DOWN";
    public static final String DONE = "DONE";

    public Configuration(ILift lift, IState state) {

        this.commands = new CommandRepository();
        this.transitions = new StateTransitions();

        commands.setDefaultCommand(DOORS_OPEN_UP, new CloseDoorsCommand(lift));
        commands.setDefaultCommand(DOORS_OPEN_DOWN, new CloseDoorsCommand(lift));
        commands.setDefaultCommand(DOORS_CLOSE_UP, new MoveUpCommand(lift));
        commands.insert(DOORS_CLOSE_UP, 2, new OpenDoorsCommand(lift, state));
        commands.insert(DOORS_CLOSE_UP, 3, new OpenDoorsCommand(lift, state));
        commands.insert(DOORS_CLOSE_UP, 7, new ImpossibleMoveCommand());
        commands.setDefaultCommand(DOORS_CLOSE_EMPTY, new CloseDoorsCommand(lift));
        commands.insert(DOORS_CLOSE_EMPTY, 3, new OpenDoorsCommand(lift, state));
        commands.insert(DOORS_CLOSE_EMPTY, 4, new OpenDoorsCommand(lift, state));
        commands.insert(DOORS_CLOSE_EMPTY, 5, new MoveDownCommand(lift));
        commands.insert(DOORS_CLOSE_EMPTY, 6, new MoveUpCommand(lift));
        commands.setDefaultCommand(DOORS_CLOSE_DOWN, new MoveDownCommand(lift));
        commands.insert(DOORS_CLOSE_DOWN, 2, new OpenDoorsCommand(lift, state));
        commands.insert(DOORS_CLOSE_DOWN, 4, new OpenDoorsCommand(lift, state));
        commands.insert(DOORS_CLOSE_DOWN, 7, new ImpossibleMoveCommand());
        commands.setDefaultCommand(DONE, new EmptyCommand());

        transitions.setDefaultState(DOORS_OPEN_UP, DONE);
        transitions.insert(DOORS_OPEN_UP, 1, DOORS_CLOSE_UP);
        transitions.insert(DOORS_OPEN_UP, 3, DOORS_CLOSE_UP);
        transitions.insert(DOORS_OPEN_UP, 4, DOORS_CLOSE_DOWN);
        transitions.insert(DOORS_OPEN_UP, 5, DOORS_CLOSE_EMPTY);
        transitions.insert(DOORS_OPEN_UP, 6, DOORS_CLOSE_EMPTY);
        transitions.setDefaultState(DOORS_OPEN_DOWN, DONE);
        transitions.insert(DOORS_OPEN_DOWN, 1, DOORS_CLOSE_DOWN);
        transitions.insert(DOORS_OPEN_DOWN, 3, DOORS_CLOSE_UP);
        transitions.insert(DOORS_OPEN_DOWN, 4, DOORS_CLOSE_DOWN);
        transitions.insert(DOORS_OPEN_DOWN, 5, DOORS_CLOSE_EMPTY);
        transitions.insert(DOORS_OPEN_DOWN, 6, DOORS_CLOSE_EMPTY);
        transitions.setDefaultState(DOORS_CLOSE_UP, DOORS_CLOSE_UP);
        transitions.insert(DOORS_CLOSE_UP, 2, DOORS_OPEN_UP);
        transitions.insert(DOORS_CLOSE_UP, 3, DOORS_OPEN_UP);
        transitions.insert(DOORS_CLOSE_UP, 7, DONE);
        transitions.setDefaultState(DOORS_CLOSE_EMPTY, DONE);
        transitions.insert(DOORS_CLOSE_EMPTY, 3, DOORS_OPEN_UP);
        transitions.insert(DOORS_CLOSE_EMPTY, 4, DOORS_OPEN_DOWN);
        transitions.insert(DOORS_CLOSE_EMPTY, 5, DOORS_CLOSE_EMPTY);
        transitions.insert(DOORS_CLOSE_EMPTY, 6, DOORS_CLOSE_EMPTY);
        transitions.setDefaultState(DOORS_CLOSE_DOWN, DOORS_CLOSE_DOWN);
        transitions.insert(DOORS_CLOSE_DOWN, 2, DOORS_OPEN_DOWN);
        transitions.insert(DOORS_CLOSE_DOWN, 4, DOORS_OPEN_DOWN);
        transitions.insert(DOORS_CLOSE_DOWN, 7, DONE);
        transitions.setDefaultState(DONE, DONE);
    }
    public ICommandRepository getCommand() {
        return commands;
    }

    public IStateTransitions getState() {
        return transitions;
    }
}
