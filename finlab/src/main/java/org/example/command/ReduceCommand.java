package org.example.command;

import org.example.error.SyntaxError;
import org.example.state.IState;

import java.util.List;
import java.util.Map;

public class ReduceCommand implements ICommand{

    private IState nextState;
    private List<String> tokenNames;
    private List<Object> stack;
    private Map<Integer, Map<String, Integer>> transitionMap;
    private List<List<List<String>>> grammar;

    public ReduceCommand(
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
        List<List<String>> production = grammar.get(nextState.getStateNumber());
        String lhs = production.get(0).get(0);
        List<String> rhs = production.get(1);
        for (int i = 0; i < 2 * rhs.size(); i++) {
            stack.remove(stack.size() - 1);
        }

        int state = (int) stack.get(stack.size() - 1);
        stack.add(lhs);
        try {
            nextState.setStateNumber(transitionMap
                    .get(state)
                    .get(lhs));
        } catch (Exception e) {
            throw new SyntaxError(e.getMessage());
        }

        stack.add(nextState.getStateNumber());
    }
}
