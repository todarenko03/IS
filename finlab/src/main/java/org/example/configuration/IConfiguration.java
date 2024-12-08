package org.example.configuration;

import org.example.command.ICommand;
import org.example.state.IState;

import java.util.List;
import java.util.Map;

public interface IConfiguration {

    List<List<List<String>>> getGrammar();

    Map<Integer, Map<String, Integer>> getTransitionMap();

    Map<Integer, Map<String, String>> getActionMap();

    List<Map.Entry<String, String>> getTokensDict();

    Map<String, ICommand> initCommandMap(IState state, List<String> tokenNames, List<Object> stack);

    ICommand getDefaultCommand();

    String getDefaultActionName();
}
