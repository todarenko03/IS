package org.example.sm;

import org.example.commands.ICommand;

import java.util.HashMap;

public class StateTransitions implements IStateTransitions {

    private final HashMap<Pair, IState> map;
    private final HashMap<IState, IState> defaultStates;

    public StateTransitions() {
        map = new HashMap<>();
        defaultStates = new HashMap<>();
    }

    @Override
    public IState nextState(final IState state, final int token) {
        Pair currentPair = new Pair<>(state, token);
        return map.getOrDefault(currentPair, defaultStates.get(state));
    }

    @Override
    public void insert(final String currentStateName, final int token, final String state) {
        map.put(new Pair<>(new State(currentStateName), token), new State(state));
    }

    @Override
    public void setDefaultState(final String currentStateName, final String defaultStateName) {
        defaultStates.put(new State(currentStateName), new State(defaultStateName));
    }
}
