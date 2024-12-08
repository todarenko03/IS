package org.example.configuration;

import org.example.command.*;
import org.example.state.IState;

import java.util.*;

public class Configuration implements IConfiguration {

    TokenConfiguration tokenConfiguration;
    GrammarConfiguration grammarConfiguration;
    TransitionConfiguration transitionConfiguration;
    ActionConfiguration actionConfiguration;

    public Configuration() {
        this.tokenConfiguration = new TokenConfiguration();
        this.grammarConfiguration = new GrammarConfiguration();
        this.transitionConfiguration = new TransitionConfiguration();
        this.actionConfiguration = new ActionConfiguration();
    }

    public String getDefaultActionName() {
        return "e";
    }


    @Override
    public List<List<List<String>>> getGrammar() {
        return grammarConfiguration.getGrammar();
    }

    @Override
    public Map<Integer, Map<String, Integer>> getTransitionMap() {
        return transitionConfiguration.getTransitionMap();
    }

    @Override
    public Map<Integer, Map<String, String>> getActionMap() {
        return actionConfiguration.getActionMap();
    }

    @Override
    public List<Map.Entry<String, String>> getTokensDict() {
        return tokenConfiguration.getTokensDict();
    }

    public Map<String, ICommand> initCommandMap(IState nextState, List<String> tokenNames, List<Object> stack) {
        Map<String, ICommand> commandMap = new HashMap<>();

        commandMap.put("s", new ShiftCommand(nextState, tokenNames, stack, transitionConfiguration.getTransitionMap(), grammarConfiguration.getGrammar()));
        commandMap.put("r", new ReduceCommand(nextState, tokenNames, stack, transitionConfiguration.getTransitionMap(), grammarConfiguration.getGrammar()));
        commandMap.put("e", new ThrowExceptionCommand());

        return commandMap;
    }

    public ICommand getDefaultCommand() {
        return new EmptyCommand();
    }
}
