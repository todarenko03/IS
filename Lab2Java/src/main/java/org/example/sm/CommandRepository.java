package org.example.sm;

import org.example.commands.ICommand;

import java.util.HashMap;

public class CommandRepository implements ICommandRepository {

    private final HashMap<Pair, ICommand> map;
    private final HashMap<IState, ICommand> defaultCommands;

    public CommandRepository() {
        map = new HashMap<>();
        defaultCommands = new HashMap<>();
    }

    @Override
    public ICommand getCommand(final IState state, final int token) {
        Pair currentPair = new Pair<>(state, token);
        return map.getOrDefault(currentPair, defaultCommands.get(state));
    }

    @Override
    public void insert(final String currentStateName, final int token, final ICommand command) {
        map.put(new Pair<>(new State(currentStateName), token), command);
    }

    @Override
    public void setDefaultCommand(final String currentStateName, final ICommand defaultCommand) {
        defaultCommands.put(new State(currentStateName), defaultCommand);
    }
}
