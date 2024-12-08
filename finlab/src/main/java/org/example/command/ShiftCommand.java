package org.example.command;

import org.example.state.IState;

import java.util.List;
import java.util.Map;

public class ShiftCommand implements ICommand{
    private IState nextState;
    private List<String> tokenNames;
    private List<Object> stack;
    private Map<Integer, Map<String, Integer>> transitionMap;
    private List<List<List<String>>> grammar;

    public ShiftCommand(
            IState nextState,
            List<String> tokenNames,
            List<Object> stack,
            Map<Integer, Map<String, Integer>> transitionMap,
            List<List<List<String>>> grammar
    ) {
        this.nextState = nextState;
        this.tokenNames = tokenNames;
        this.stack = stack;
        this.transitionMap = transitionMap;
        this.grammar = grammar;
    }

    @Override
    public void execute() {
        String token = tokenNames.get(0);
        tokenNames.remove(0);
        stack.add(token);
        stack.add(nextState.getStateNumber());
    }
}
